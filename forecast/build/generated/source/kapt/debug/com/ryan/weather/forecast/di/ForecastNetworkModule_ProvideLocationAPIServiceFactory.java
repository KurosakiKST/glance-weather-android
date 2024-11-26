package com.ryan.weather.forecast.di;

import com.ryan.weather.forecast.data.remote.LocationAPIService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class ForecastNetworkModule_ProvideLocationAPIServiceFactory implements Factory<LocationAPIService> {
  private final Provider<Retrofit> retrofitProvider;

  public ForecastNetworkModule_ProvideLocationAPIServiceFactory(
      Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public LocationAPIService get() {
    return provideLocationAPIService(retrofitProvider.get());
  }

  public static ForecastNetworkModule_ProvideLocationAPIServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new ForecastNetworkModule_ProvideLocationAPIServiceFactory(retrofitProvider);
  }

  public static LocationAPIService provideLocationAPIService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(ForecastNetworkModule.INSTANCE.provideLocationAPIService(retrofit));
  }
}
