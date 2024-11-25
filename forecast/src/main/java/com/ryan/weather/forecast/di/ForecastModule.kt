package com.ryan.weather.forecast.di

import com.ryan.weather.forecast.data.datasource.LocationDataSource
import com.ryan.weather.forecast.data.datasource.WeatherDataSource
import com.ryan.weather.forecast.data.remote.LocationRemoteDataSource
import com.ryan.weather.forecast.data.remote.WeatherRemoteDataSource
import com.ryan.weather.forecast.data.repoImpl.LocationRepoImpl
import com.ryan.weather.forecast.data.repoImpl.WeatherRepoImpl
import com.ryan.weather.forecast.domain.repository.LocationRepository
import com.ryan.weather.forecast.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ForecastModule {

    /**-------DataSources--------*/
    @Binds
    abstract fun provideWeatherDataSource(impl: WeatherRemoteDataSource): WeatherDataSource

    @Binds
    abstract fun provideLocationDataSource(impl: LocationRemoteDataSource): LocationDataSource

    /**-------Repositories-------*/

    @Binds
    abstract fun provideWeatherRepository(impl: WeatherRepoImpl): WeatherRepository

    @Binds
    abstract fun provideLocationRepository(impl: LocationRepoImpl): LocationRepository
}