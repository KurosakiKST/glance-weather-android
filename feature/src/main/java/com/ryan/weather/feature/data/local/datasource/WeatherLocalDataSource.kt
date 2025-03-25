package com.ryan.weather.feature.data.local.datasource

import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.feature.data.datasource.WeatherDataSource
import com.ryan.weather.feature.data.local.database.dao.WeatherDao
import com.ryan.weather.feature.data.local.database.entity.weather.CurrentWeatherEntity
import com.ryan.weather.feature.data.local.database.entity.weather.ForecastDayEntity
import com.ryan.weather.feature.data.local.database.entity.weather.ForecastWeatherEntity
import com.ryan.weather.feature.data.local.database.entity.weather.LocationWeatherEntity
import com.ryan.weather.feature.data.local.database.mapper.WeatherEntityMapper.toDomainModel
import com.ryan.weather.feature.domain.model.Forecast
import com.ryan.weather.feature.domain.model.Weather
import javax.inject.Inject

class WeatherLocalDataSource @Inject constructor(
    private val weatherDao: WeatherDao
) : WeatherDataSource {

    override suspend fun getCurrentWeather(
        apiKey: String,
        city: String
    ): NetworkResult<Weather, NetworkError> {
        return try {
            val weatherEntity = weatherDao.getWeather(city)
            if (weatherEntity != null) {
                NetworkResult.Success(weatherEntity.toDomainModel())
            } else {
                NetworkResult.Error(NetworkError.NO_CACHED_DATA)
            }
        } catch (e: Exception) {
            NetworkResult.Error(NetworkError.SERVER_ERROR)
        }
    }

    override suspend fun getForecastWeather(
        apiKey: String,
        city: String,
        days: Int
    ): NetworkResult<Forecast, NetworkError> {
        return try {
            val forecastWithDays = weatherDao.getForecastWeather(city)
            if (forecastWithDays != null) {
                val location = weatherDao.getLocationWeather(city)?.toDomainModel()
                val currentWeather = weatherDao.getCurrentWeather(city)?.toDomainModel()
                if (location != null && currentWeather != null) {
                    val current = currentWeather.current
                    NetworkResult.Success(forecastWithDays.toDomainModel(location, current))
                } else {
                    NetworkResult.Error(NetworkError.NO_CACHED_DATA)
                }
            } else {
                NetworkResult.Error(NetworkError.NO_CACHED_DATA)
            }
        } catch (e: Exception) {
            NetworkResult.Error(NetworkError.SERVER_ERROR)
        }
    }

    override suspend fun addCurrentWeather(weather: CurrentWeatherEntity) {
        try {
            weatherDao.insertWeather(weather)
        } catch (e: Exception) {
            // Log the error or handle it if needed
        }
    }

    override suspend fun addForecastWeather(forecast: ForecastWeatherEntity) {
        try {
            weatherDao.insertForecastWeather(forecast)
        } catch (e: Exception) {
            // Log the error or handle it if needed
        }
    }

    override suspend fun addLocationWeather(locationEntity: LocationWeatherEntity) {
        try {
            weatherDao.insertLocationWeather(locationEntity)
        } catch (e: Exception) {
            // Log the error or handle it if needed
        }
    }

    override suspend fun addForecastDays(forecastDays: List<ForecastDayEntity>) {
        try {
            weatherDao.insertForecastDays(forecastDays)
        } catch (e: Exception) {
            // Log the error or handle it if needed
        }
    }
}
