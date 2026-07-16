package com.empire.myapplication.core.utils;

/**
 * ملاحظة مهمة حول عزل الحسابات:
 * بيانات الملف الشخصي (الاسم/العمر/الجنس/الصورة) أصبحت مخزّنة بمفتاح مختلف لكل مستخدم
 * (مبني على uid الحالي)، بدل مفتاح ثابت واحد يتشارك فيه كل من يستخدم الجهاز.
 * هذا يحل مشكلتين معاً:
 * 1) اختلاط بيانات الملف الشخصي بين الحسابات المختلفة على نفس الجهاز.
 * 2) اختفاء البيانات بعد تسجيل الخروج ثم العودة لنفس الحساب (لأنها كانت تُمسح بالكامل
 *    بدل أن تبقى محفوظة تحت مفتاح خاص بذلك الحساب).
 */
@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0017J\b\u0010\u0019\u001a\u00020\u0017H\u0007J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u001b\u001a\u00020\tH\u0002J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 J\b\u0010\"\u001a\u00020\u000bH\u0002J\u0006\u0010#\u001a\u00020\u0007J\b\u0010$\u001a\u0004\u0018\u00010\u0007J\u0006\u0010%\u001a\u00020\u0007J\u0006\u0010&\u001a\u00020\u0007J\u0006\u0010\'\u001a\u00020\u0007J\u0006\u0010(\u001a\u00020\u0007J\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020*J\u0006\u0010,\u001a\u00020*J\u000e\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u001eJ\u000e\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0007J(\u00101\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\b\u00104\u001a\u0004\u0018\u00010\u0007J\u0010\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\u0007H\u0002J\u000e\u00107\u001a\u00020\u00172\u0006\u00108\u001a\u00020*J\u0010\u00109\u001a\u00020\u00172\b\u0010:\u001a\u0004\u0018\u00010\u0007J\u000e\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\tJ\u000e\u0010=\u001a\u00020\u00172\u0006\u0010+\u001a\u00020*J\u000e\u0010>\u001a\u00020\u00172\u0006\u0010?\u001a\u00020*J\u000e\u0010@\u001a\u00020\u00172\u0006\u0010A\u001a\u00020\u000bJ\u000e\u0010B\u001a\u00020\u00172\u0006\u0010C\u001a\u00020\u0007J\u0010\u0010D\u001a\u00020\u00172\b\u0010:\u001a\u0004\u0018\u00010\u0007J\u000e\u0010E\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u0007J\u000e\u0010F\u001a\u00020\u00172\u0006\u0010G\u001a\u00020\u0007J\u000e\u0010H\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0007J\u000e\u0010I\u001a\u00020\u00172\u0006\u00102\u001a\u00020\u0007J\u000e\u0010J\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u0007J\u000e\u0010K\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u001eR\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f\u00a8\u0006L"}, d2 = {"Lcom/empire/myapplication/core/utils/ThemeManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_bgImageUri", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_bgOpacity", "", "_themeType", "Lcom/empire/myapplication/core/utils/ThemeType;", "bgImageUri", "Lkotlinx/coroutines/flow/StateFlow;", "getBgImageUri", "()Lkotlinx/coroutines/flow/StateFlow;", "bgOpacity", "getBgOpacity", "prefs", "Landroid/content/SharedPreferences;", "themeType", "getThemeType", "clearGuestProfileData", "", "clearSessionFlags", "clearUserData", "getBackgroundImageUriInternal", "getBackgroundOpacityInternal", "getPinnedSessions", "", "", "getSavedAccounts", "", "Lcom/empire/myapplication/core/utils/SavedAccount;", "getThemeTypeInternal", "getUserAge", "getUserAvatarUri", "getUserEmail", "getUserGender", "getUserId", "getUserName", "hasAcceptedTerms", "", "isGuest", "isLoggedIn", "isSessionPinned", "id", "removeAccount", "uid", "saveAccount", "name", "email", "avatarUri", "scopedKey", "base", "setAcceptedTerms", "accepted", "setBackgroundImageUri", "uri", "setBackgroundOpacity", "opacity", "setGuest", "setLoggedIn", "loggedIn", "setThemeType", "type", "setUserAge", "age", "setUserAvatarUri", "setUserEmail", "setUserGender", "gender", "setUserId", "setUserName", "switchAccount", "togglePinSession", "app_debug"})
public final class ThemeManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences prefs = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.empire.myapplication.core.utils.ThemeType> _themeType = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.empire.myapplication.core.utils.ThemeType> themeType = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _bgImageUri = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> bgImageUri = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Float> _bgOpacity = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Float> bgOpacity = null;
    
    @javax.inject.Inject()
    public ThemeManager(@dagger.hilt.android.qualifiers.ApplicationContext()
    @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.empire.myapplication.core.utils.ThemeType> getThemeType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getBgImageUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Float> getBgOpacity() {
        return null;
    }
    
    private final com.empire.myapplication.core.utils.ThemeType getThemeTypeInternal() {
        return null;
    }
    
    public final void setThemeType(@org.jetbrains.annotations.NotNull()
    com.empire.myapplication.core.utils.ThemeType type) {
    }
    
    private final java.lang.String getBackgroundImageUriInternal() {
        return null;
    }
    
    public final void setBackgroundImageUri(@org.jetbrains.annotations.Nullable()
    java.lang.String uri) {
    }
    
    private final float getBackgroundOpacityInternal() {
        return 0.0F;
    }
    
    public final void setBackgroundOpacity(float opacity) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
    }
    
    private final java.lang.String scopedKey(java.lang.String base) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserAge() {
        return null;
    }
    
    public final void setUserAge(@org.jetbrains.annotations.NotNull()
    java.lang.String age) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserGender() {
        return null;
    }
    
    public final void setUserGender(@org.jetbrains.annotations.NotNull()
    java.lang.String gender) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserEmail() {
        return null;
    }
    
    public final void setUserEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserAvatarUri() {
        return null;
    }
    
    public final void setUserAvatarUri(@org.jetbrains.annotations.Nullable()
    java.lang.String uri) {
    }
    
    public final boolean isLoggedIn() {
        return false;
    }
    
    public final void setLoggedIn(boolean loggedIn) {
    }
    
    public final boolean isGuest() {
        return false;
    }
    
    public final void setGuest(boolean isGuest) {
    }
    
    public final boolean hasAcceptedTerms() {
        return false;
    }
    
    public final void setAcceptedTerms(boolean accepted) {
    }
    
    /**
     * يمسح فقط علم تسجيل الدخول/الضيف عند الخروج. بيانات الملف الشخصي للحساب المسجّل
     * تبقى محفوظة تحت مفتاحها الخاص (uid) وتظهر تلقائياً عند العودة لنفس الحساب.
     * بيانات وضع الضيف تُمسح بشكل منفصل ودائماً عبر clearGuestProfileData().
     */
    public final void clearSessionFlags() {
    }
    
    /**
     * يمسح بيانات الملف الشخصي الخاصة بوضع الضيف تحديداً (لا تُحفظ أي بيانات ضيف نهائياً).
     */
    public final void clearGuestProfileData() {
    }
    
    @java.lang.Deprecated()
    public final void clearUserData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.empire.myapplication.core.utils.SavedAccount> getSavedAccounts() {
        return null;
    }
    
    public final void saveAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String avatarUri) {
    }
    
    public final void removeAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
    }
    
    public final void switchAccount(@org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.Long> getPinnedSessions() {
        return null;
    }
    
    public final void togglePinSession(long id) {
    }
    
    public final boolean isSessionPinned(long id) {
        return false;
    }
}