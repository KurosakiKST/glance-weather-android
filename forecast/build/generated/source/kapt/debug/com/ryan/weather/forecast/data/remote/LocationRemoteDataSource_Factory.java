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
public final class LocationRemoteDataSource_Factory implements Factory<LocationRemoteDataSource> {
  private final Provider<LocationAPIService> locationAPIServiceProvider;

  public LocationRemoteDataSource_Factory(Provider<LocationAPIService> locationAPIServiceProvider) {
    this.locationAPIServiceProvider = locationAPIServiceProvider;
  }

  @Override
  public LocationRemoteDataSource get() {
    return newInstance(locationAPIServiceProvider.get());
  }

  public static LocationRemoteDataSource_Factory create(
      Provider<LocationAPIService> locationAPIServiceProvider) {
    return new LocationRemoteDataSource_Factory(locationAPIServiceProvider);
  }

  public static LocationRemoteDataSource newInstance(LocationAPIService locationAPIService) {
    return new LocationRemoteDataSource(locationAPIService);
  }
}
