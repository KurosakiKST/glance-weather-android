package com.ryan.weather.forecast.domain.usecase;

import com.ryan.weather.forecast.domain.repository.WeatherRepository;
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
public final class WeatherUseCase_Factory implements Factory<WeatherUseCase> {
  private final Provider<WeatherRepository> weatherRepositoryProvider;

  public WeatherUseCase_Factory(Provider<WeatherRepository> weatherRepositoryProvider) {
    this.weatherRepositoryProvider = weatherRepositoryProvider;
  }

  @Override
  public WeatherUseCase get() {
    return newInstance(weatherRepositoryProvider.get());
  }

  public static WeatherUseCase_Factory create(
      Provider<WeatherRepository> weatherRepositoryProvider) {
    return new WeatherUseCase_Factory(weatherRepositoryProvider);
  }

  public static WeatherUseCase newInstance(WeatherRepository weatherRepository) {
    return new WeatherUseCase(weatherRepository);
  }
}
