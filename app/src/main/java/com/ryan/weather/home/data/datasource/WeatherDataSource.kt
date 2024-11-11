package com.ryan.weather.home.data.datasource

import com.ryan.weather.home.data.local.database.entity.weather.CurrentWeatherEntity
import com.ryan.weather.home.domain.model.ForecastDomainModel
import com.ryan.weather.home.domain.model.WeatherDomainModel
import com.ryan.weather.core.presentation.utils.WResult
import com.ryan.weather.home.data.local.database.entity.weather.ForecastDayEntity
import com.ryan.weather.home.data.local.database.entity.weather.ForecastWeatherEntity
import com.ryan.weather.home.data.local.database.entity.weather.LocationWeatherEntity

interface WeatherDataSource {

    suspend fun getCurrentWeather(apiKey: String, city: String): WResult<WeatherDomainModel>

    suspend fun getForecastWeather(
        apiKey: String,
        city: String,
        days: Int
    ): WResult<ForecastDomainModel>

    suspend fun addCurrentWeather(weather: CurrentWeatherEntity)

    suspend fun addForecastWeather(forecast: ForecastWeatherEntity)

    abstract suspend fun addLocationWeather(locationEntity: LocationWeatherEntity)

    abstract suspend fun addForecastDays(forecastDays: List<ForecastDayEntity>)

}