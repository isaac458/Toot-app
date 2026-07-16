package com.empire.myapplication;

import com.empire.myapplication.core.utils.ThemeManager;
import com.empire.myapplication.data.repository.AiRepository;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<ThemeManager> themeManagerProvider;

  private final Provider<AiRepository> aiRepositoryProvider;

  public MainActivity_MembersInjector(Provider<ThemeManager> themeManagerProvider,
      Provider<AiRepository> aiRepositoryProvider) {
    this.themeManagerProvider = themeManagerProvider;
    this.aiRepositoryProvider = aiRepositoryProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<ThemeManager> themeManagerProvider,
      Provider<AiRepository> aiRepositoryProvider) {
    return new MainActivity_MembersInjector(themeManagerProvider, aiRepositoryProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectThemeManager(instance, themeManagerProvider.get());
    injectAiRepository(instance, aiRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.empire.myapplication.MainActivity.themeManager")
  public static void injectThemeManager(MainActivity instance, ThemeManager themeManager) {
    instance.themeManager = themeManager;
  }

  @InjectedFieldSignature("com.empire.myapplication.MainActivity.aiRepository")
  public static void injectAiRepository(MainActivity instance, AiRepository aiRepository) {
    instance.aiRepository = aiRepository;
  }
}
