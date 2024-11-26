package com.ryan.weather.forecast.presentation.detail;

import com.ryan.weather.forecast.domain.usecase.LocationUseCase;
import com.ryan.weather.forecast.domain.usecase.WeatherUseCase;
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
public final class DetailVM_Factory implements Factory<DetailVM> {
  private final Provider<WeatherUseCase> weatherUseCaseProvider;

  private final Provider<LocationUseCase> locationUseCaseProvider;

  public DetailVM_Factory(Provider<WeatherUseCase> weatherUseCaseProvider,
      Provider<LocationUseCase> locationUseCaseProvider) {
    this.weatherUseCaseProvider = weatherUseCaseProvider;
    this.locationUseCaseProvider = locationUseCaseProvider;
  }

  @Override
  public DetailVM get() {
    return newInstance(weatherUseCaseProvider.get(), locationUseCaseProvider.get());
  }

  public static DetailVM_Factory create(Provider<WeatherUseCase> weatherUseCaseProvider,
      Provider<LocationUseCase> locationUseCaseProvider) {
    return new DetailVM_Factory(weatherUseCaseProvider, locationUseCaseProvider);
  }

  public static DetailVM newInstance(WeatherUseCase weatherUseCase,
      LocationUseCase locationUseCase) {
    return new DetailVM(weatherUseCase, locationUseCase);
  }
}
