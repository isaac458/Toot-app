package com.empire.myapplication.ui.auth;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J1\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00072!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00120\u0015J4\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\t2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001eJ\u0010\u0010\u001f\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\u0007J\u0014\u0010!\u001a\u00020\u00122\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001eR\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/empire/myapplication/ui/auth/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "themeManager", "Lcom/empire/myapplication/core/utils/ThemeManager;", "(Lcom/empire/myapplication/core/utils/ThemeManager;)V", "_error", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_isLoading", "", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "error", "Lkotlinx/coroutines/flow/StateFlow;", "getError", "()Lkotlinx/coroutines/flow/StateFlow;", "isLoading", "firebaseAuthWithGoogle", "", "idToken", "onSuccess", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "isNewUser", "saveOnboardingData", "age", "gender", "acceptedTerms", "onComplete", "Lkotlin/Function0;", "setError", "message", "setGuestMode", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.empire.myapplication.core.utils.ThemeManager themeManager = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _error = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> error = null;
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.empire.myapplication.core.utils.ThemeManager themeManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    java.lang.String message) {
    }
    
    public final void firebaseAuthWithGoogle(@org.jetbrains.annotations.NotNull()
    java.lang.String idToken, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onSuccess) {
    }
    
    public final void setGuestMode(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
    }
    
    public final void saveOnboardingData(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String age, @org.jetbrains.annotations.NotNull()
    java.lang.String gender, boolean acceptedTerms, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onComplete) {
    }
}