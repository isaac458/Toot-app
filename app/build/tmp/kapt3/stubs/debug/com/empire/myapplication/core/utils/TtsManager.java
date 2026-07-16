package com.empire.myapplication.core.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\fJ\u0018\u0010\u0011\u001a\u00020\f2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bJ\u0006\u0010\u0012\u001a\u00020\fJ \u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bJ\u0006\u0010\u0015\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/empire/myapplication/core/utils/TtsManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "fullText", "", "isInitialized", "", "isPaused", "onFinished", "Lkotlin/Function0;", "", "remainingText", "tts", "Landroid/speech/tts/TextToSpeech;", "pause", "resume", "shutdown", "speak", "text", "stop", "app_debug"})
public final class TtsManager {
    @org.jetbrains.annotations.Nullable()
    private android.speech.tts.TextToSpeech tts;
    private boolean isInitialized = false;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> onFinished;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fullText = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String remainingText = "";
    private boolean isPaused = false;
    
    public TtsManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void speak(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFinished) {
    }
    
    public final void pause() {
    }
    
    public final void resume(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> onFinished) {
    }
    
    public final void stop() {
    }
    
    public final void shutdown() {
    }
}