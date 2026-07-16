package com.empire.myapplication.data.remote

import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.*

interface AiApiService {
    @POST("v1beta/models/{model}:generateContent")
    suspend fun generateContent(
        @Path("model") model: String,
        @Query("key") apiKey: String?, // اختياري إذا استخدمنا التوكن
        @Header("Authorization") authHeader: String?, // لدعم توكن AQ.
        @Body request: GeminiRequest
    ): Response<GeminiResponse>
}

// هيكلية الطلب لـ Gemini
data class GeminiRequest(
    @SerializedName("contents") val contents: List<GeminiContent>,
    @SerializedName("system_instruction") val systemInstruction: GeminiSystemInstruction? = null,
    @SerializedName("generation_config") val generationConfig: GeminiGenerationConfig = GeminiGenerationConfig()
)

data class GeminiSystemInstruction(
    @SerializedName("parts") val parts: List<GeminiPart>
)

data class GeminiContent(
    @SerializedName("role") val role: String, // "user" or "model"
    @SerializedName("parts") val parts: List<GeminiPart>
)

data class GeminiPart(
    @SerializedName("text") val text: String? = null,
    @SerializedName("inline_data") val inlineData: GeminiInlineData? = null
)

data class GeminiInlineData(
    @SerializedName("mime_type") val mimeType: String = "image/jpeg",
    @SerializedName("data") val data: String // Base64
)

data class GeminiGenerationConfig(
    @SerializedName("temperature") val temperature: Float = 0.7f,
    @SerializedName("top_k") val topK: Int = 40,
    @SerializedName("top_p") val topP: Float = 0.95f,
    @SerializedName("max_output_tokens") val maxOutputTokens: Int = 2048
)

// هيكلية الرد من Gemini
data class GeminiResponse(
    @SerializedName("candidates") val candidates: List<GeminiCandidate>?
)

data class GeminiCandidate(
    @SerializedName("content") val content: GeminiContent?
)
