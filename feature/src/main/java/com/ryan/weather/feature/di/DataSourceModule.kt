package com.ryan.weather.feature.di

import com.ryan.weather.feature.data.datasource.LocationDataSource
import com.ryan.weather.feature.data.remote.LocationRemoteDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    @Singleton
    abstract fun bindLocationDataSource(
        locationRemoteDataSource: LocationRemoteDataSource
    ): LocationDataSource
}