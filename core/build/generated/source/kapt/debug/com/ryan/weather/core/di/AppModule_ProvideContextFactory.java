package com.ryan.weather.core.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideContextFactory implements Factory<Context> {
  private final AppModule module;

  private final Provider<Context> appContextProvider;

  public AppModule_ProvideContextFactory(AppModule module, Provider<Context> appContextProvider) {
    this.module = module;
    this.appContextProvider = appContextProvider;
  }

  @Override
  public Context get() {
    return provideContext(module, appContextProvider.get());
  }

  public static AppModule_ProvideContextFactory create(AppModule module,
      Provider<Context> appContextProvider) {
    return new AppModule_ProvideContextFactory(module, appContextProvider);
  }

  public static Context provideContext(AppModule instance, Context appContext) {
    return Preconditions.checkNotNullFromProvides(instance.provideContext(appContext));
  }
}
