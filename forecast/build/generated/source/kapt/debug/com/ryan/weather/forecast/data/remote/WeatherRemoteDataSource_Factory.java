package com.ryan.weather.forecast.data.remote;

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
    "KotlinInternalInJava"
})
public final class WeatherRemoteDataSource_Factory implements Factory<WeatherRemoteDataSource> {
  private final Provider<WeatherAPIService> weatherAPIServiceProvider;

  public WeatherRemoteDataSource_Factory(Provider<WeatherAPIService> weatherAPIServiceProvider) {
    this.weatherAPIServiceProvider = weatherAPIServiceProvider;
  }

  @Override
  public WeatherRemoteDataSource get() {
    return newInstance(weatherAPIServiceProvider.get());
  }

  public static WeatherRemoteDataSource_Factory create(
      Provider<WeatherAPIService> weatherAPIServiceProvider) {
    return new WeatherRemoteDataSource_Factory(weatherAPIServiceProvider);
  }

  public static WeatherRemoteDataSource newInstance(WeatherAPIService weatherAPIService) {
    return new WeatherRemoteDataSource(weatherAPIService);
  }
}
