package com.ryan.weather.weather.data.datasource

import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.core.domain.utils.Result
import com.ryan.weather.weather.data.local.database.entity.weather.CurrentWeatherEntity
import com.ryan.weather.weather.domain.model.Forecast
import com.ryan.weather.weather.domain.model.Weather
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastDayEntity
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastWeatherEntity
import com.ryan.weather.weather.data.local.database.entity.weather.LocationWeatherEntity

interface WeatherDataSource {

    suspend fun getCurrentWeather(apiKey: String, city: String): Result<Weather, NetworkError>

    suspend fun getForecastWeather(
        apiKey: String,
        city: String,
        days: Int
    ): Result<Forecast, NetworkError>

    suspend fun addCurrentWeather(weather: CurrentWeatherEntity)

    suspend fun addForecastWeather(forecast: ForecastWeatherEntity)

    abstract suspend fun addLocationWeather(locationEntity: LocationWeatherEntity)

    abstract suspend fun addForecastDays(forecastDays: List<ForecastDayEntity>)

}