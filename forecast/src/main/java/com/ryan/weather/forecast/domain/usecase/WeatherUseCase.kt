package com.ryan.weather.forecast.domain.usecase

import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.forecast.domain.model.Forecast
import com.ryan.weather.forecast.domain.model.Weather
import com.ryan.weather.forecast.domain.repository.WeatherRepository
import javax.inject.Inject

class WeatherUseCase @Inject constructor(
    private val weatherRepository: WeatherRepository
) {
    suspend fun getCurrentWeather(
        city: String
    ): NetworkResult<Weather, NetworkError> {
        return weatherRepository.getCurrentWeather(city)
    }

    suspend fun getForecastedWeather(
        city: String,
        days: Int
    ): NetworkResult<Forecast, NetworkError> {
        return weatherRepository.getForeCastWeather(city, days)
    }
}
