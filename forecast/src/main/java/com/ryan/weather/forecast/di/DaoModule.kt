<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/di/DaoModule.kt
package com.ryan.weather.forecast.di

import com.ryan.weather.forecast.data.local.database.WeatherDatabase
import com.ryan.weather.forecast.data.local.database.dao.WeatherDao
========
package com.ryan.weather.di

import com.ryan.weather.weather.data.local.database.WeatherDatabase
import com.ryan.weather.weather.data.local.database.dao.WeatherDao
>>>>>>>> main:app/src/main/java/com/ryan/weather/di/DaoModule.kt
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DaoModule {
    @Provides
    @Singleton
    fun bindCurrentWeatherDao(weatherDatabase: WeatherDatabase): WeatherDao =
        weatherDatabase.weatherDao()
}