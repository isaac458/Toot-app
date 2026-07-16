package com.empire.myapplication.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J_\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012H\u0082@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u001aJ \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001cH\u0086@\u00a2\u0006\u0002\u0010!J\u0016\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\bH\u0082@\u00a2\u0006\u0002\u0010\u001aJ\"\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0%0\f2\u0006\u0010#\u001a\u00020\bH\u0002J\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\f0\'2\u0006\u0010 \u001a\u00020\u001cJ\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\f0\'2\u0006\u0010\u0019\u001a\u00020\bJ\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\f0\'2\u0006\u0010-\u001a\u00020\u001cJ\u0012\u0010.\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\bH\u0002J=\u00100\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001c2%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012H\u0086@\u00a2\u0006\u0002\u00101JQ\u00102\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\b2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\b2%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0012H\u0086@\u00a2\u0006\u0002\u00104J\u001e\u00105\u001a\u00020\u00162\u0006\u00106\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u00107R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/empire/myapplication/data/repository/AiRepository;", "", "apiService", "Lcom/empire/myapplication/data/remote/AiApiService;", "tootDao", "Lcom/empire/myapplication/data/local/TootDao;", "(Lcom/empire/myapplication/data/remote/AiApiService;Lcom/empire/myapplication/data/local/TootDao;)V", "callApiWithRetry", "", "systemMessage", "Lcom/empire/myapplication/data/remote/GroqMessage;", "history", "", "useVisionModel", "", "maxRetries", "", "onRetry", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "attempt", "", "(Lcom/empire/myapplication/data/remote/GroqMessage;Ljava/util/List;ZILkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearSessionsForOwner", "ownerId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createNewSession", "", "title", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMessages", "chatId", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extractAndSaveMemory", "content", "extractSources", "Lkotlin/Pair;", "getMessages", "Lkotlinx/coroutines/flow/Flow;", "Lcom/empire/myapplication/data/local/Message;", "getSessionsForOwner", "Lcom/empire/myapplication/data/local/ChatSession;", "getSourcesForMessage", "Lcom/empire/myapplication/data/local/SourceRef;", "messageId", "parseGroqError", "errorBody", "regenerateMessage", "(JLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessage", "imageBase64", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSessionTitle", "sessionId", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class AiRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.empire.myapplication.data.remote.AiApiService apiService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.empire.myapplication.data.local.TootDao tootDao = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MODEL_NAME = "llama-3.3-70b-versatile";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String VISION_MODEL_NAME = "llama-3.2-11b-vision-preview";
    @org.jetbrains.annotations.NotNull()
    public static final com.empire.myapplication.data.repository.AiRepository.Companion Companion = null;
    
    @javax.inject.Inject()
    public AiRepository(@org.jetbrains.annotations.NotNull()
    com.empire.myapplication.data.remote.AiApiService apiService, @org.jetbrains.annotations.NotNull()
    com.empire.myapplication.data.local.TootDao tootDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.empire.myapplication.data.local.Message>> getMessages(long chatId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.empire.myapplication.data.local.ChatSession>> getSessionsForOwner(@org.jetbrains.annotations.NotNull()
    java.lang.String ownerId) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object createNewSession(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String ownerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateSessionTitle(long sessionId, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendMessage(long chatId, @org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.Nullable()
    java.lang.String imageBase64, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onRetry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object regenerateMessage(long chatId, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onRetry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.empire.myapplication.data.local.SourceRef>> getSourcesForMessage(long messageId) {
        return null;
    }
    
    private final java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> extractSources(java.lang.String content) {
        return null;
    }
    
    /**
     * يفكّك جسم خطأ Groq/OpenAI (JSON) ويستخرج منه type / code / message الحقيقيين
     * بدل ما يتقص أو يتخفى.
     */
    private final java.lang.String parseGroqError(java.lang.String errorBody) {
        return null;
    }
    
    private final java.lang.Object callApiWithRetry(com.empire.myapplication.data.remote.GroqMessage systemMessage, java.util.List<com.empire.myapplication.data.remote.GroqMessage> history, boolean useVisionModel, int maxRetries, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onRetry, kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteMessages(long chatId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearSessionsForOwner(@org.jetbrains.annotations.NotNull()
    java.lang.String ownerId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.Object extractAndSaveMemory(java.lang.String content, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/empire/myapplication/data/repository/AiRepository$Companion;", "", "()V", "MODEL_NAME", "", "VISION_MODEL_NAME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}