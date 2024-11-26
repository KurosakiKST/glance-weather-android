package com.ryan.weather.forecast.data.repoImpl;

import com.ryan.weather.forecast.data.local.datasource.WeatherLocalDataSource;
import com.ryan.weather.forecast.data.remote.WeatherRemoteDataSource;
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
    "KotlinInternalInJava"
})
public final class WeatherRepoImpl_Factory implements Factory<WeatherRepoImpl> {
  private final Provider<WeatherRemoteDataSource> weatherRemoteDataSourceProvider;

  private final Provider<WeatherLocalDataSource> weatherLocalDataSourceProvider;

  public WeatherRepoImpl_Factory(Provider<WeatherRemoteDataSource> weatherRemoteDataSourceProvider,
      Provider<WeatherLocalDataSource> weatherLocalDataSourceProvider) {
    this.weatherRemoteDataSourceProvider = weatherRemoteDataSourceProvider;
    this.weatherLocalDataSourceProvider = weatherLocalDataSourceProvider;
  }

  @Override
  public WeatherRepoImpl get() {
    return newInstance(weatherRemoteDataSourceProvider.get(), weatherLocalDataSourceProvider.get());
  }

  public static WeatherRepoImpl_Factory create(
      Provider<WeatherRemoteDataSource> weatherRemoteDataSourceProvider,
      Provider<WeatherLocalDataSource> weatherLocalDataSourceProvider) {
    return new WeatherRepoImpl_Factory(weatherRemoteDataSourceProvider, weatherLocalDataSourceProvider);
  }

  public static WeatherRepoImpl newInstance(WeatherRemoteDataSource weatherRemoteDataSource,
      WeatherLocalDataSource weatherLocalDataSource) {
    return new WeatherRepoImpl(weatherRemoteDataSource, weatherLocalDataSource);
  }
}
