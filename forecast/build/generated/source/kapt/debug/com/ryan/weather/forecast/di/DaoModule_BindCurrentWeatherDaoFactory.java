package com.ryan.weather.forecast.di;

import com.ryan.weather.forecast.data.local.database.WeatherDatabase;
import com.ryan.weather.forecast.data.local.database.dao.WeatherDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DaoModule_BindCurrentWeatherDaoFactory implements Factory<WeatherDao> {
  private final Provider<WeatherDatabase> weatherDatabaseProvider;

  public DaoModule_BindCurrentWeatherDaoFactory(Provider<WeatherDatabase> weatherDatabaseProvider) {
    this.weatherDatabaseProvider = weatherDatabaseProvider;
  }

  @Override
  public WeatherDao get() {
    return bindCurrentWeatherDao(weatherDatabaseProvider.get());
  }

  public static DaoModule_BindCurrentWeatherDaoFactory create(
      Provider<WeatherDatabase> weatherDatabaseProvider) {
    return new DaoModule_BindCurrentWeatherDaoFactory(weatherDatabaseProvider);
  }

  public static WeatherDao bindCurrentWeatherDao(WeatherDatabase weatherDatabase) {
    return Preconditions.checkNotNullFromProvides(DaoModule.INSTANCE.bindCurrentWeatherDao(weatherDatabase));
  }
}
