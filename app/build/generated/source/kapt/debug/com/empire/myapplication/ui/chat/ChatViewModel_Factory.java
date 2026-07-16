package com.empire.myapplication.ui.chat;

import android.app.Application;
import com.empire.myapplication.core.utils.ThemeManager;
import com.empire.myapplication.data.repository.AiRepository;
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
public final class ChatViewModel_Factory implements Factory<ChatViewModel> {
  private final Provider<Application> applicationProvider;

  private final Provider<AiRepository> repositoryProvider;

  private final Provider<ThemeManager> themeManagerProvider;

  public ChatViewModel_Factory(Provider<Application> applicationProvider,
      Provider<AiRepository> repositoryProvider, Provider<ThemeManager> themeManagerProvider) {
    this.applicationProvider = applicationProvider;
    this.repositoryProvider = repositoryProvider;
    this.themeManagerProvider = themeManagerProvider;
  }

  @Override
  public ChatViewModel get() {
    return newInstance(applicationProvider.get(), repositoryProvider.get(), themeManagerProvider.get());
  }

  public static ChatViewModel_Factory create(Provider<Application> applicationProvider,
      Provider<AiRepository> repositoryProvider, Provider<ThemeManager> themeManagerProvider) {
    return new ChatViewModel_Factory(applicationProvider, repositoryProvider, themeManagerProvider);
  }

  public static ChatViewModel newInstance(Application application, AiRepository repository,
      ThemeManager themeManager) {
    return new ChatViewModel(application, repository, themeManager);
  }
}
