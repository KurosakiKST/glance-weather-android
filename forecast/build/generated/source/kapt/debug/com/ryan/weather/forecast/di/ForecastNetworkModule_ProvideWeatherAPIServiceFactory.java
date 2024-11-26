package com.ryan.weather.forecast.di;

import com.ryan.weather.forecast.data.remote.WeatherAPIService;
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
public final class ForecastNetworkModule_ProvideWeatherAPIServiceFactory implements Factory<WeatherAPIService> {
  private final Provider<Retrofit> retrofitProvider;

  public ForecastNetworkModule_ProvideWeatherAPIServiceFactory(
      Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public WeatherAPIService get() {
    return provideWeatherAPIService(retrofitProvider.get());
  }

  public static ForecastNetworkModule_ProvideWeatherAPIServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new ForecastNetworkModule_ProvideWeatherAPIServiceFactory(retrofitProvider);
  }

  public static WeatherAPIService provideWeatherAPIService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(ForecastNetworkModule.INSTANCE.provideWeatherAPIService(retrofit));
  }
}
