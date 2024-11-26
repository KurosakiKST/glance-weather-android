package com.ryan.weather.forecast.data.local.datasource;

import com.ryan.weather.forecast.data.local.database.dao.WeatherDao;
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
public final class WeatherLocalDataSource_Factory implements Factory<WeatherLocalDataSource> {
  private final Provider<WeatherDao> weatherDaoProvider;

  public WeatherLocalDataSource_Factory(Provider<WeatherDao> weatherDaoProvider) {
    this.weatherDaoProvider = weatherDaoProvider;
  }

  @Override
  public WeatherLocalDataSource get() {
    return newInstance(weatherDaoProvider.get());
  }

  public static WeatherLocalDataSource_Factory create(Provider<WeatherDao> weatherDaoProvider) {
    return new WeatherLocalDataSource_Factory(weatherDaoProvider);
  }

  public static WeatherLocalDataSource newInstance(WeatherDao weatherDao) {
    return new WeatherLocalDataSource(weatherDao);
  }
}
