package com.empire.myapplication.ui.chat;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\u001a8\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0007\u00a8\u0006\n"}, d2 = {"SearchSessionsScreen", "", "sessions", "", "Lcom/empire/myapplication/data/local/ChatSession;", "onDismiss", "Lkotlin/Function0;", "onSessionClick", "Lkotlin/Function1;", "", "app_debug"})
public final class SearchSessionsScreenKt {
    
    /**
     * صفحة بحث مستقلة عن المحادثات (على غرار ChatGPT)، بدل حقل بحث داخل القائمة الجانبية
     * الذي كان يسبب ارتفاع مربع الكتابة أثناء البحث. هنا مربع الكتابة الرئيسي غير موجود إطلاقاً
     * في هذه الشاشة، لذلك لا يوجد أي تأثير عليه.
     */
    @androidx.compose.runtime.Composable()
    public static final void SearchSessionsScreen(@org.jetbrains.annotations.NotNull()
    java.util.List<com.empire.myapplication.data.local.ChatSession> sessions, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onDismiss, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> onSessionClick) {
    }
}