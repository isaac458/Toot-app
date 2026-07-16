package com.empire.myapplication.data.repository;

import com.empire.myapplication.data.local.TootDao;
import com.empire.myapplication.data.remote.AiApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AiRepository_Factory implements Factory<AiRepository> {
  private final Provider<AiApiService> apiServiceProvider;

  private final Provider<TootDao> tootDaoProvider;

  public AiRepository_Factory(Provider<AiApiService> apiServiceProvider,
      Provider<TootDao> tootDaoProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.tootDaoProvider = tootDaoProvider;
  }

  @Override
  public AiRepository get() {
    return newInstance(apiServiceProvider.get(), tootDaoProvider.get());
  }

  public static AiRepository_Factory create(Provider<AiApiService> apiServiceProvider,
      Provider<TootDao> tootDaoProvider) {
    return new AiRepository_Factory(apiServiceProvider, tootDaoProvider);
  }

  public static AiRepository newInstance(AiApiService apiService, TootDao tootDao) {
    return new AiRepository(apiService, tootDao);
  }
}
