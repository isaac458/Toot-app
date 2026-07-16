package com.empire.myapplication.ui.auth;

import com.empire.myapplication.core.utils.ThemeManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class AuthViewModel_Factory implements Factory<AuthViewModel> {
  private final Provider<ThemeManager> themeManagerProvider;

  public AuthViewModel_Factory(Provider<ThemeManager> themeManagerProvider) {
    this.themeManagerProvider = themeManagerProvider;
  }

  @Override
  public AuthViewModel get() {
    return newInstance(themeManagerProvider.get());
  }

  public static AuthViewModel_Factory create(Provider<ThemeManager> themeManagerProvider) {
    return new AuthViewModel_Factory(themeManagerProvider);
  }

  public static AuthViewModel newInstance(ThemeManager themeManager) {
    return new AuthViewModel(themeManager);
  }
}
