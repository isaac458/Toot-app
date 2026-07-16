package com.empire.myapplication.di;

import com.empire.myapplication.data.local.TootDao;
import com.empire.myapplication.data.local.TootDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideTootDaoFactory implements Factory<TootDao> {
  private final Provider<TootDatabase> databaseProvider;

  public DatabaseModule_ProvideTootDaoFactory(Provider<TootDatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public TootDao get() {
    return provideTootDao(databaseProvider.get());
  }

  public static DatabaseModule_ProvideTootDaoFactory create(
      Provider<TootDatabase> databaseProvider) {
    return new DatabaseModule_ProvideTootDaoFactory(databaseProvider);
  }

  public static TootDao provideTootDao(TootDatabase database) {
    return Preconditions.checkNotNullFromProvides(DatabaseModule.INSTANCE.provideTootDao(database));
  }
}
