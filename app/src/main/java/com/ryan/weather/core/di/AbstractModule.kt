package com.ryan.weather.core.di

import com.ryan.weather.home.data.datasource.WeatherDataSource
import com.ryan.weather.home.data.remotedatasource.WeatherRemoteDataSource
import com.ryan.weather.home.data.repoImpl.WeatherRepoImpl
import com.ryan.weather.home.domain.repository.WeatherRepository
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

    /**-------Repositories-------*/

    @Binds
    abstract fun provideWeatherRepository(impl: WeatherRepoImpl): WeatherRepository
}