package com.empire.myapplication.data.repository

import com.empire.myapplication.BuildConfig
import com.empire.myapplication.data.local.Message
import com.empire.myapplication.data.local.SourceRef
import com.empire.myapplication.data.local.TootDao
import com.empire.myapplication.data.local.UserMemory
import com.empire.myapplication.data.remote.*
import org.json.JSONObject
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AiRepository @Inject constructor(
    private val apiService: AiApiService,
    private val tootDao: TootDao
) {
    fun getMessages(chatId: Long): Flow<List<Message>> = tootDao.getMessagesForSession(chatId)
    
    fun getSessionsForOwner(ownerId: String): Flow<List<com.empire.myapplication.data.local.ChatSession>> = tootDao.getSessionsForOwner(ownerId)

    suspend fun createNewSession(title: String, ownerId: String = "guest"): Long {
        return tootDao.insertSession(com.empire.myapplication.data.local.ChatSession(title = title, ownerId = ownerId))
    }

    suspend fun updateSessionTitle(sessionId: Long, title: String) {
        tootDao.updateSessionTitle(sessionId, title)
    }

    suspend fun sendMessage(
        chatId: Long,
        content: String,
        imageBase64: String? = null,
        onRetry: ((attempt: Int) -> Unit)? = null
    ): String {
        // 1. حفظ رسالة المستخدم
        val userMsg = Message(sessionId = chatId, role = "user", content = content, imageUri = imageBase64)
        tootDao.insertMessage(userMsg)

        // 2. محاولة استخراج معلومات للذاكرة
        extractAndSaveMemory(content)

        // 3. تحضير السياق (System Instruction + Memory)
        val memories = tootDao.getUserMemory().first()
        val memoryContext = if (memories.isNotEmpty()) {
            "\nمعلومات سابقة عن المستخدم: " + memories.joinToString(". ") { "${it.key}: ${it.value}" }
        } else ""

        val systemInstruction = GeminiSystemInstruction(
            parts = listOf(GeminiPart(text = com.empire.myapplication.core.AiConstants.SYSTEM_PROMPT + memoryContext))
        )

        // 4. تحويل التاريخ إلى تنسيق Gemini مع ضمان تتابع الأدوار ودمج المتكرر
        val chatHistory = mutableListOf<GeminiContent>()
        tootDao.getMessagesForSessionOnce(chatId).forEach { msg ->
            val role = if (msg.role == "user") "user" else "model"
            val parts = mutableListOf<GeminiPart>()
            
            if (msg.content.isNotBlank()) {
                parts.add(GeminiPart(text = msg.content))
            }
            
            if (msg.imageUri != null) {
                // تحديد نوع الـ Mime تلقائياً
                val mimeType = when {
                    msg.imageUri.startsWith("data:image/png") -> "image/png"
                    msg.imageUri.startsWith("data:image/webp") -> "image/webp"
                    msg.imageUri.startsWith("data:image/heic") -> "image/heic"
                    else -> "image/jpeg"
                }

                // تنظيف Base64 من الأسطر، المسافات، وأي بادئة
                val cleanBase64 = msg.imageUri
                    .substringAfter("base64,")
                    .replace("\\s".toRegex(), "")
                    .replace("\n", "")
                    .replace("\r", "")
                
                if (cleanBase64.isNotBlank()) {
                    parts.add(GeminiPart(inlineData = GeminiInlineData(mimeType = mimeType, data = cleanBase64)))
                }
            }

            if (parts.isNotEmpty()) {
                if (chatHistory.isNotEmpty() && chatHistory.last().role == role) {
                    // دمج الأجزاء إذا كان نفس الدور متكرر
                    val updatedParts = chatHistory.last().parts + parts
                    chatHistory[chatHistory.size - 1] = chatHistory.last().copy(parts = updatedParts)
                } else {
                    chatHistory.add(GeminiContent(role = role, parts = parts))
                }
            }
        }

        // 4.5 التأكد من أن التاريخ يبدأ بـ user وينتهي بـ user ( Gemini يتوقع أن آخر رسالة هي من الـ user ليرد عليها الموديل)
        // أو على الأقل يبدأ بـ user.
        while (chatHistory.isNotEmpty() && chatHistory.first().role != "user") {
            chatHistory.removeAt(0)
        }

        // 5. استدعاء API مع Retry
        val aiContent = callApiWithRetry(chatHistory, systemInstruction, onRetry = onRetry)

        // 6. استخراج المصادر وحفظ الرد
        val extractedSources = extractSources(aiContent)
        val modelMsgId = tootDao.insertMessage(
            Message(sessionId = chatId, role = "model", content = aiContent, hasSources = extractedSources.isNotEmpty())
        )
        extractedSources.forEach { (title, url) ->
            tootDao.insertSource(SourceRef(messageId = modelMsgId, title = title, url = url, ownerId = "shared"))
        }

        return aiContent
    }

    fun getSourcesForMessage(messageId: Long) = tootDao.getSourcesForMessage(messageId)

    private fun extractSources(content: String): List<Pair<String, String>> {
        val linkRegex = Regex("\\[([^\\]]+)]\\((https?://[^\\s)]+)\\)")
        return linkRegex.findAll(content)
            .map { it.groupValues[1] to it.groupValues[2] }
            .distinctBy { it.second }
            .take(6)
            .toList()
    }

    companion object {
        // اسم الموديل في مكان واحد فقط، بدل ما كان مكرر ومختلف بين مكان الاستدعاء ورسالة الخطأ 404
        // (الكود القديم كان يستخدم gemini-3.5-flash فعلياً لكن يطبع gemini-2.0-flash-exp في رسالة الخطأ، وده تضليل عند التشخيص)
        private const val MODEL_NAME = "gemini-3.5-flash"
    }

    /**
     * يفكّك جسم خطأ Gemini (JSON) ويستخرج منه status / reason / message الحقيقيين
     * بدل ما كان الكود القديم يطبع الـ JSON الخام مقصوص على 150 حرف أو يخفي التفاصيل بالكامل.
     */
    private fun parseGeminiError(errorBody: String?): String {
        if (errorBody.isNullOrBlank()) return "(لا يوجد جسم خطأ راجع من الخادم)"
        return try {
            val root = JSONObject(errorBody).optJSONObject("error") ?: return errorBody
            val status = root.optString("status", "?")
            val message = root.optString("message", "?")
            val details = root.optJSONArray("details")
            var reason = ""
            if (details != null) {
                for (i in 0 until details.length()) {
                    val d = details.optJSONObject(i) ?: continue
                    val r = d.optString("reason", "")
                    if (r.isNotBlank()) { reason = r; break }
                }
            }
            buildString {
                append("status=$status")
                if (reason.isNotBlank()) append(" | reason=$reason")
                append("\nرسالة جوجل: $message")
            }
        } catch (e: Exception) {
            // الجسم مش JSON صالح (نادر) - اطبعه خام كامل بدل ما تخفيه
            "تعذّر تحليل جسم الخطأ كـ JSON (${e.javaClass.simpleName}). الجسم الخام:\n$errorBody"
        }
    }

    private suspend fun callApiWithRetry(
        contents: List<GeminiContent>,
        systemInstruction: GeminiSystemInstruction,
        maxRetries: Int = 3,
        onRetry: ((attempt: Int) -> Unit)? = null
    ): String {
        val delayMillis = listOf(5_000L, 15_000L, 30_000L)

        if (BuildConfig.AI_API_KEY.isBlank()) {
            return "❌ لا يوجد مفتاح API مُعرَّف في المشروع (AI_API_KEY فارغ في local.properties)."
        }

        repeat(maxRetries) { attempt ->
            try {
                val request = GeminiRequest(
                    contents = contents,
                    systemInstruction = systemInstruction
                )

                // منطق ذكي للتعامل مع المفتاح (سواء كان AIza دائم أو AQ مؤقت)
                val rawKey = BuildConfig.AI_API_KEY.trim()
                // تنظيف المفتاح من أي فراغات أو أسطر مخفية
                val key = rawKey.replace("\\s".toRegex(), "")
                val isToken = key.startsWith("AQ.")

                val response = apiService.generateContent(
                    model = MODEL_NAME,
                    apiKey = if (isToken) null else key,
                    authHeader = if (isToken) "Bearer $key" else null,
                    request = request
                )

                if (response.isSuccessful) {
                    val aiText = response.body()?.candidates?.firstOrNull()?.content?.parts?.firstOrNull()?.text
                    return aiText ?: "⚠️ الخادم رجّع 200 لكن بدون أي نص رد (candidates فاضية أو parts فاضية). راجع سياسة السلامة/الفلترة في الاستجابة الكاملة: ${response.body()}"
                }

                val errorBody = try { response.errorBody()?.string() } catch (e: Exception) { "(فشل قراءة جسم الخطأ: ${e.javaClass.simpleName})" }
                val diagnosis = parseGeminiError(errorBody)
                val authMode = if (isToken) "Bearer AQ-token" else "query param AIza-key"

                when (response.code()) {
                    400 -> return "❌ خطأ 400 (طلب غير صالح).\nنوع المصادقة المُستخدَم: $authMode\n$diagnosis"
                    429 -> {
                        if (attempt < maxRetries - 1) {
                            onRetry?.invoke(attempt + 1)
                            delay(delayMillis[attempt])
                        } else {
                            return "⚠️ 429 - تجاوزت الحصة/معدل الطلبات بعد $maxRetries محاولات.\n$diagnosis"
                        }
                    }
                    401, 403 -> return "❌ رفض الخادم المفتاح (كود ${response.code()}).\nنوع المصادقة المُستخدَم: $authMode\n$diagnosis"
                    404 -> return "❌ خطأ 404 (غير موجود).\nالموديل المُستخدَم فعلياً: $MODEL_NAME\n$diagnosis"
                    else -> return "❌ خطأ غير متوقع (كود ${response.code()}).\n$diagnosis"
                }
            } catch (e: Exception) {
                if (attempt == maxRetries - 1) {
                    // نطبع نوع الاستثناء بالضبط (Timeout؟ UnknownHost؟ SSL؟) بدل رسالة عامة "حدث خطأ في الاتصال"
                    return "❌ استثناء أثناء الاتصال: ${e.javaClass.simpleName}\nالرسالة: ${e.localizedMessage ?: "(بدون رسالة)"}"
                }
                onRetry?.invoke(attempt + 1)
                delay(delayMillis[attempt])
            }
        }
        return "⚠️ فشلت كل المحاولات ($maxRetries) بدون استجابة ناجحة."
    }

    suspend fun deleteMessages(chatId: Long) {
        tootDao.deleteSessionById(chatId)
    }

    suspend fun clearSessionsForOwner(ownerId: String) {
        tootDao.clearSessionsForOwner(ownerId)
    }

    private suspend fun extractAndSaveMemory(content: String) {
        if (content.contains("اسمي هو", ignoreCase = true) || content.contains("اسمي", ignoreCase = true)) {
            val name = content.replace("اسمي هو", "").replace("اسمي", "").trim()
            if (name.length < 20) tootDao.insertMemory(UserMemory(key = "اسم المستخدم", value = name))
        }

        if (content.contains("أحب", ignoreCase = true)) {
            val hobby = content.substringAfter("أحب").trim()
            if (hobby.length < 50) tootDao.insertMemory(UserMemory(key = "هواية/اهتمام", value = hobby))
        }
    }
}
