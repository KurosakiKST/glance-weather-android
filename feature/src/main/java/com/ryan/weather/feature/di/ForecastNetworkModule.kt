package com.ryan.weather.feature.di

import com.ryan.weather.feature.data.remote.LocationAPIService
import com.ryan.weather.feature.data.remote.WeatherAPIService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ForecastNetworkModule {

    @Provides
    @Singleton
    fun provideWeatherAPIService(retrofit: Retrofit): WeatherAPIService {
        return retrofit.create(WeatherAPIService::class.java)
    }

    @Provides
    @Singleton
    fun provideLocationAPIService(retrofit: Retrofit): LocationAPIService {
        return retrofit.create(LocationAPIService::class.java)
    }
}