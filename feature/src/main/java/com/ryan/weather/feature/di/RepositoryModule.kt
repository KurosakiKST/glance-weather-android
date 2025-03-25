package com.ryan.weather.feature.di

import com.ryan.weather.feature.data.repoImpl.LocationRepoImpl
import com.ryan.weather.feature.data.repoImpl.WeatherRepoImpl
import com.ryan.weather.feature.domain.repository.LocationRepository
import com.ryan.weather.feature.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepoImpl: WeatherRepoImpl
    ): WeatherRepository

    @Binds
    @Singleton
    abstract fun bindLocationRepository(
        locationRepoImpl: LocationRepoImpl
    ): LocationRepository
}