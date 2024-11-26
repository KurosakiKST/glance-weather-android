package com.ryan.weather.forecast.data.repoImpl;

import com.ryan.weather.forecast.data.datasource.LocationDataSource;
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
public final class LocationRepoImpl_Factory implements Factory<LocationRepoImpl> {
  private final Provider<LocationDataSource> locationDataSourceProvider;

  public LocationRepoImpl_Factory(Provider<LocationDataSource> locationDataSourceProvider) {
    this.locationDataSourceProvider = locationDataSourceProvider;
  }

  @Override
  public LocationRepoImpl get() {
    return newInstance(locationDataSourceProvider.get());
  }

  public static LocationRepoImpl_Factory create(
      Provider<LocationDataSource> locationDataSourceProvider) {
    return new LocationRepoImpl_Factory(locationDataSourceProvider);
  }

  public static LocationRepoImpl newInstance(LocationDataSource locationDataSource) {
    return new LocationRepoImpl(locationDataSource);
  }
}
