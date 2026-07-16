package com.empire.myapplication.ui.chat;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u000201J\u0010\u00103\u001a\u0002012\u0006\u00104\u001a\u00020\u0016H\u0002J\u000e\u00105\u001a\u0002012\u0006\u00106\u001a\u00020\u000bJ\u000e\u00107\u001a\u0002012\u0006\u00104\u001a\u00020\u0016J\u0006\u00108\u001a\u00020\u0016J\u001a\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020;0\u00110:2\u0006\u0010<\u001a\u00020\u0016J\u000e\u0010=\u001a\u0002012\u0006\u00104\u001a\u00020\u0016J\b\u0010>\u001a\u000201H\u0014J\u0006\u0010?\u001a\u000201J\u0006\u0010@\u001a\u000201J\u0006\u0010A\u001a\u000201J\u0006\u0010B\u001a\u000201J\u001e\u0010C\u001a\u0002012\u0006\u0010D\u001a\u00020\u000b2\u000e\b\u0002\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u0011J\u000e\u0010G\u001a\u0002012\u0006\u0010H\u001a\u00020\rJ\u000e\u0010I\u001a\u0002012\u0006\u00106\u001a\u00020\u000bJ\u0016\u0010J\u001a\u0002012\u0006\u0010<\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u000bJ\b\u0010L\u001a\u000201H\u0002J\u0006\u0010M\u001a\u000201J\u0006\u0010N\u001a\u000201J\u0016\u0010O\u001a\u0002012\u0006\u00104\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\u000bR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0010\u0010$\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0010\u0010\'\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006Q"}, d2 = {"Lcom/empire/myapplication/ui/chat/ChatViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "repository", "Lcom/empire/myapplication/data/repository/AiRepository;", "themeManager", "Lcom/empire/myapplication/core/utils/ThemeManager;", "(Landroid/app/Application;Lcom/empire/myapplication/data/repository/AiRepository;Lcom/empire/myapplication/core/utils/ThemeManager;)V", "_botStatus", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_isListening", "", "_isPaused", "_isTyping", "_messages", "", "Lcom/empire/myapplication/data/local/Message;", "_sessions", "Lcom/empire/myapplication/data/local/ChatSession;", "_speakingMessageId", "", "_streamingText", "botStatus", "Lkotlinx/coroutines/flow/StateFlow;", "getBotStatus", "()Lkotlinx/coroutines/flow/StateFlow;", "chatJob", "Lkotlinx/coroutines/Job;", "currentChatId", "isListening", "isPaused", "isTyping", "messages", "getMessages", "messagesJob", "sessions", "getSessions", "sessionsJob", "speakingMessageId", "getSpeakingMessageId", "streamingText", "getStreamingText", "getThemeManager", "()Lcom/empire/myapplication/core/utils/ThemeManager;", "ttsManager", "Lcom/empire/myapplication/core/utils/TtsManager;", "clearChat", "", "clearGuestSessions", "collectMessages", "chatId", "createNewSession", "title", "deleteSession", "getActiveChatId", "getSourcesForMessage", "Lkotlinx/coroutines/flow/Flow;", "Lcom/empire/myapplication/data/local/SourceRef;", "messageId", "loadChat", "onCleared", "pauseSpeaking", "regenerateLastResponse", "reloadForCurrentUser", "resumeSpeaking", "sendMessage", "content", "images", "Landroid/graphics/Bitmap;", "setListening", "listening", "shareChat", "speak", "text", "startCollectingSessions", "stopGeneration", "stopSpeaking", "updateSessionTitle", "newTitle", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ChatViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.empire.myapplication.data.repository.AiRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.empire.myapplication.core.utils.ThemeManager themeManager = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.empire.myapplication.data.local.Message>> _messages = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.empire.myapplication.data.local.Message>> messages = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.empire.myapplication.data.local.ChatSession>> _sessions = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.empire.myapplication.data.local.ChatSession>> sessions = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isTyping = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isTyping = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _botStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> botStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isListening = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isListening = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _streamingText = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> streamingText = null;
    @org.jetbrains.annotations.NotNull()
    private final com.empire.myapplication.core.utils.TtsManager ttsManager = null;
    private long currentChatId = -1L;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job chatJob;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job messagesJob;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Long> _speakingMessageId = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Long> speakingMessageId = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isPaused = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isPaused = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job sessionsJob;
    
    @javax.inject.Inject()
    public ChatViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    com.empire.myapplication.data.repository.AiRepository repository, @org.jetbrains.annotations.NotNull()
    com.empire.myapplication.core.utils.ThemeManager themeManager) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.empire.myapplication.core.utils.ThemeManager getThemeManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.empire.myapplication.data.local.Message>> getMessages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.empire.myapplication.data.local.ChatSession>> getSessions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isTyping() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getBotStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isListening() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getStreamingText() {
        return null;
    }
    
    public final long getActiveChatId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Long> getSpeakingMessageId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isPaused() {
        return null;
    }
    
    private final void startCollectingSessions() {
    }
    
    public final void reloadForCurrentUser() {
    }
    
    public final void createNewSession(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void loadChat(long chatId) {
    }
    
    /**
     * يبدأ جمع رسائل محادثة معيّنة، مع إلغاء أي عملية جمع سابقة أولاً.
     */
    private final void collectMessages(long chatId) {
    }
    
    public final void shareChat(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void clearChat() {
    }
    
    public final void clearGuestSessions() {
    }
    
    public final void updateSessionTitle(long chatId, @org.jetbrains.annotations.NotNull()
    java.lang.String newTitle) {
    }
    
    /**
     * حذف محادثة كاملة (تُستخدم من قائمة المحادثات وشاشة البحث).
     */
    public final void deleteSession(long chatId) {
    }
    
    /**
     * مربع المصادر: يجلب المصادر المستخرجة تلقائياً لرسالة معيّنة.
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.empire.myapplication.data.local.SourceRef>> getSourcesForMessage(long messageId) {
        return null;
    }
    
    public final void stopGeneration() {
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String content, @org.jetbrains.annotations.NotNull()
    java.util.List<android.graphics.Bitmap> images) {
    }
    
    public final void regenerateLastResponse() {
    }
    
    public final void setListening(boolean listening) {
    }
    
    public final void speak(long messageId, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void pauseSpeaking() {
    }
    
    public final void resumeSpeaking() {
    }
    
    public final void stopSpeaking() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}