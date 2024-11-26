package com.ryan.weather.forecast.domain.usecase;

import com.ryan.weather.forecast.domain.repository.LocationRepository;
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
public final class LocationUseCase_Factory implements Factory<LocationUseCase> {
  private final Provider<LocationRepository> locationRepositoryProvider;

  public LocationUseCase_Factory(Provider<LocationRepository> locationRepositoryProvider) {
    this.locationRepositoryProvider = locationRepositoryProvider;
  }

  @Override
  public LocationUseCase get() {
    return newInstance(locationRepositoryProvider.get());
  }

  public static LocationUseCase_Factory create(
      Provider<LocationRepository> locationRepositoryProvider) {
    return new LocationUseCase_Factory(locationRepositoryProvider);
  }

  public static LocationUseCase newInstance(LocationRepository locationRepository) {
    return new LocationUseCase(locationRepository);
  }
}
