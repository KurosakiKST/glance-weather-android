package com.ryan.weather.di

import com.ryan.weather.weather.data.datasource.LocationDataSource
import com.ryan.weather.weather.data.datasource.WeatherDataSource
import com.ryan.weather.weather.data.remote.LocationRemoteDataSource
import com.ryan.weather.weather.data.remote.WeatherRemoteDataSource
import com.ryan.weather.weather.data.repoImpl.LocationRepoImpl
import com.ryan.weather.weather.data.repoImpl.WeatherRepoImpl
import com.ryan.weather.weather.domain.repository.LocationRepository
import com.ryan.weather.weather.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AbstractModule {

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