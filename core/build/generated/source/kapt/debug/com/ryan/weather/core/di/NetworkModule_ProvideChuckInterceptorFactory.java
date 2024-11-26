package com.ryan.weather.core.di;

import android.content.Context;
import com.chuckerteam.chucker.api.ChuckerInterceptor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class NetworkModule_ProvideChuckInterceptorFactory implements Factory<ChuckerInterceptor> {
  private final Provider<Context> contextProvider;

  public NetworkModule_ProvideChuckInterceptorFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public ChuckerInterceptor get() {
    return provideChuckInterceptor(contextProvider.get());
  }

  public static NetworkModule_ProvideChuckInterceptorFactory create(
      Provider<Context> contextProvider) {
    return new NetworkModule_ProvideChuckInterceptorFactory(contextProvider);
  }

  public static ChuckerInterceptor provideChuckInterceptor(Context context) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideChuckInterceptor(context));
  }
}
