package com.ryan.weather.forecast.presentation.home;

import com.ryan.weather.forecast.domain.usecase.LocationUseCase;
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
public final class HomeVM_Factory implements Factory<HomeVM> {
  private final Provider<LocationUseCase> locationUseCaseProvider;

  public HomeVM_Factory(Provider<LocationUseCase> locationUseCaseProvider) {
    this.locationUseCaseProvider = locationUseCaseProvider;
  }

  @Override
  public HomeVM get() {
    return newInstance(locationUseCaseProvider.get());
  }

  public static HomeVM_Factory create(Provider<LocationUseCase> locationUseCaseProvider) {
    return new HomeVM_Factory(locationUseCaseProvider);
  }

  public static HomeVM newInstance(LocationUseCase locationUseCase) {
    return new HomeVM(locationUseCase);
  }
}
