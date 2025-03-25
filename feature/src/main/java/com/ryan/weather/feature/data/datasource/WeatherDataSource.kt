package com.ryan.weather.feature.data.datasource

import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.feature.data.local.database.entity.weather.CurrentWeatherEntity
import com.ryan.weather.feature.data.local.database.entity.weather.ForecastDayEntity
import com.ryan.weather.feature.data.local.database.entity.weather.ForecastWeatherEntity
import com.ryan.weather.feature.data.local.database.entity.weather.LocationWeatherEntity
import com.ryan.weather.feature.domain.model.Forecast
import com.ryan.weather.feature.domain.model.Weather

interface WeatherDataSource {

    suspend fun getCurrentWeather(
        apiKey: String,
        city: String
    ): NetworkResult<Weather, NetworkError>

    suspend fun getForecastWeather(
        apiKey: String,
        city: String,
        days: Int
    ): NetworkResult<Forecast, NetworkError>

    suspend fun addCurrentWeather(weather: CurrentWeatherEntity)

    suspend fun addForecastWeather(forecast: ForecastWeatherEntity)

    abstract suspend fun addLocationWeather(locationEntity: LocationWeatherEntity)

    abstract suspend fun addForecastDays(forecastDays: List<ForecastDayEntity>)

}