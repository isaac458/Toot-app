package com.empire.myapplication.ui.chat;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0011\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\u0002\b\bH\u0003\u001a\u00aa\u0001\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001d\u0010\u001e\u001a\"\u0010\u001f\u001a\u00020\u00042\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010!\u001a\u00020\"H\u0007\u001a\u001e\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003\u001a8\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\'2\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007\u00f8\u0001\u0000\u00a2\u0006\u0004\b)\u0010*\u001al\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003\u001a\u00b6\u0001\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u0002062\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010,\u001a\u00020\u000f2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u00108\u001a\u00020\u000f2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u001a\b\u0002\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u00120?0\u0006H\u0007\u001a(\u0010A\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007\u001a2\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u000b2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\rH\u0003\u001at\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\u000b2\u0006\u0010H\u001a\u00020\u000f2\u0006\u0010I\u001a\u00020\u000f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003\u001a&\u0010N\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\'2\u0006\u0010O\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003\u001a\"\u0010P\u001a\u00020\u00042\u0018\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0\u00120?0\u0006H\u0003\u001a$\u0010Q\u001a\u00020\u00042\f\u0010R\u001a\b\u0012\u0004\u0012\u00020@0\u00122\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0003\u001a\b\u0010S\u001a\u00020\u0004H\u0007\u001a\b\u0010T\u001a\u00020\u0004H\u0007\u001a\u001c\u0010U\u001a\u00020\u00042\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\rH\u0007\u001a \u0010W\u001a\u00020\u00152\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020\u00152\u0006\u0010[\u001a\u00020\u0015H\u0002\u001a*\u0010\\\u001a\u0004\u0018\u00010\u00132\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`2\u0006\u0010Z\u001a\u00020\u00152\u0006\u0010[\u001a\u00020\u0015H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u0007\n\u0005\b\u00a1\u001e0\u0001\u00a8\u0006a"}, d2 = {"BorderColor", "Landroidx/compose/ui/graphics/Color;", "J", "BorderedIconButton", "", "onClick", "Lkotlin/Function0;", "content", "Landroidx/compose/runtime/Composable;", "ChatInputArea", "text", "", "onTextChange", "Lkotlin/Function1;", "isListening", "", "isTyping", "images", "", "Landroid/graphics/Bitmap;", "onClearImage", "", "onSend", "onMicClick", "onCameraClick", "onGalleryClick", "themeColor", "modifier", "Landroidx/compose/ui/Modifier;", "ChatInputArea-IYMWPmI", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZZLjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/ui/Modifier;)V", "ChatScreen", "onLogout", "viewModel", "Lcom/empire/myapplication/ui/chat/ChatViewModel;", "DrawerBottomItem", "label", "DrawerMenuItem", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "color", "DrawerMenuItem-9LQNqLg", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;JLkotlin/jvm/functions/Function0;)V", "MessageActionsRow", "isSpeaking", "isPaused", "onListen", "onPauseListen", "onResumeListen", "onStopListen", "onCopy", "onShare", "MessageItem", "message", "Lcom/empire/myapplication/data/local/Message;", "streamingText", "isLastBotMessage", "onSpeak", "onPauseSpeak", "onResumeSpeak", "onStopSpeak", "onRegenerate", "getSources", "Lkotlinx/coroutines/flow/Flow;", "Lcom/empire/myapplication/data/local/SourceRef;", "PulsingMicButton", "RenameSessionDialog", "initialTitle", "onDismiss", "onConfirm", "SessionRow", "title", "isSelected", "isPinned", "onRename", "onDelete", "onTogglePin", "onMove", "SmallActionIcon", "contentDescription", "SourcesClickableIndicator", "SourcesDialog", "sources", "ThinkingItem", "ThreeDotsIndicator", "WelcomeGrid", "onPromptClick", "calculateInSampleSize", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "decodeSampledBitmap", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "app_debug"})
public final class ChatScreenKt {
    private static final long BorderColor = 0L;
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void ChatScreen(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onLogout, @org.jetbrains.annotations.NotNull()
    com.empire.myapplication.ui.chat.ChatViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void BorderedIconButton(kotlin.jvm.functions.Function0<kotlin.Unit> onClick, kotlin.jvm.functions.Function0<kotlin.Unit> content) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    @androidx.compose.runtime.Composable()
    private static final void SessionRow(java.lang.String title, boolean isSelected, boolean isPinned, kotlin.jvm.functions.Function0<kotlin.Unit> onClick, kotlin.jvm.functions.Function0<kotlin.Unit> onRename, kotlin.jvm.functions.Function0<kotlin.Unit> onDelete, kotlin.jvm.functions.Function0<kotlin.Unit> onTogglePin, kotlin.jvm.functions.Function0<kotlin.Unit> onShare, kotlin.jvm.functions.Function0<kotlin.Unit> onMove) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void RenameSessionDialog(java.lang.String initialTitle, kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onConfirm) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    @androidx.compose.runtime.Composable()
    public static final void MessageItem(@org.jetbrains.annotations.NotNull()
    com.empire.myapplication.data.local.Message message, @org.jetbrains.annotations.Nullable()
    java.lang.String streamingText, boolean isSpeaking, boolean isPaused, boolean isLastBotMessage, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSpeak, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onPauseSpeak, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onResumeSpeak, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onStopSpeak, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onShare, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onRegenerate, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.flow.Flow<? extends java.util.List<com.empire.myapplication.data.local.SourceRef>>> getSources) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void MessageActionsRow(boolean isSpeaking, boolean isPaused, kotlin.jvm.functions.Function0<kotlin.Unit> onListen, kotlin.jvm.functions.Function0<kotlin.Unit> onPauseListen, kotlin.jvm.functions.Function0<kotlin.Unit> onResumeListen, kotlin.jvm.functions.Function0<kotlin.Unit> onStopListen, kotlin.jvm.functions.Function0<kotlin.Unit> onCopy, kotlin.jvm.functions.Function0<kotlin.Unit> onShare) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void SmallActionIcon(androidx.compose.ui.graphics.vector.ImageVector icon, java.lang.String contentDescription, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
    
    /**
     * مؤشر المصادر: أيقونة صغيرة ونبضة خفيفة تفتح نافذة المصادر عند النقر
     */
    @androidx.compose.runtime.Composable()
    private static final void SourcesClickableIndicator(kotlin.jvm.functions.Function0<? extends kotlinx.coroutines.flow.Flow<? extends java.util.List<com.empire.myapplication.data.local.SourceRef>>> getSources) {
    }
    
    /**
     * نافذة المصادر بنمط ChatGPT: تحتوي على شعارات المواقع الرسمية وعناوينها
     */
    @androidx.compose.runtime.Composable()
    private static final void SourcesDialog(java.util.List<com.empire.myapplication.data.local.SourceRef> sources, kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void WelcomeGrid(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onPromptClick) {
    }
    
    private static final android.graphics.Bitmap decodeSampledBitmap(android.content.Context context, android.net.Uri uri, int reqWidth, int reqHeight) {
        return null;
    }
    
    private static final int calculateInSampleSize(android.graphics.BitmapFactory.Options options, int reqWidth, int reqHeight) {
        return 0;
    }
    
    @androidx.compose.runtime.Composable()
    public static final void PulsingMicButton(boolean isListening, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onClick, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ThinkingItem() {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ThreeDotsIndicator() {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void DrawerBottomItem(java.lang.String label, kotlin.jvm.functions.Function0<kotlin.Unit> onClick) {
    }
}