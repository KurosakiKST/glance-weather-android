package com.ryan.weather.core.di;

import com.chuckerteam.chucker.api.ChuckerInterceptor;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

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
    "KotlinInternalInJava"
})
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<ChuckerInterceptor> chuckInterceptorProvider;

  public NetworkModule_ProvideOkHttpClientFactory(
      Provider<ChuckerInterceptor> chuckInterceptorProvider) {
    this.chuckInterceptorProvider = chuckInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(chuckInterceptorProvider.get());
  }

  public static NetworkModule_ProvideOkHttpClientFactory create(
      Provider<ChuckerInterceptor> chuckInterceptorProvider) {
    return new NetworkModule_ProvideOkHttpClientFactory(chuckInterceptorProvider);
  }

  public static OkHttpClient provideOkHttpClient(ChuckerInterceptor chuckInterceptor) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideOkHttpClient(chuckInterceptor));
  }
}
