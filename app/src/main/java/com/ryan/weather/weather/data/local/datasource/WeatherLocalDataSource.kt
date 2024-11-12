package com.ryan.weather.weather.data.local.datasource

import com.ryan.weather.weather.data.datasource.WeatherDataSource
import com.ryan.weather.weather.data.local.database.dao.WeatherDao
import com.ryan.weather.weather.data.local.database.entity.weather.CurrentWeatherEntity
import com.ryan.weather.weather.data.local.database.mapper.WeatherEntityMapper.toDomainModel
import com.ryan.weather.weather.domain.model.ForecastDomainModel
import com.ryan.weather.weather.domain.model.WeatherDomainModel
import com.ryan.weather.core.domain.util.Result
import com.ryan.weather.core.domain.util.NetworkError
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastDayEntity
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastWeatherEntity
import com.ryan.weather.weather.data.local.database.entity.weather.LocationWeatherEntity
import javax.inject.Inject

class WeatherLocalDataSource @Inject constructor(
    private val weatherDao: WeatherDao
) : WeatherDataSource {

    override suspend fun getCurrentWeather(
        apiKey: String,
        city: String
    ): Result<WeatherDomainModel, NetworkError> {
        return try {
            val weatherEntity = weatherDao.getWeather(city)
            if (weatherEntity != null) {
                Result.Success(weatherEntity.toDomainModel())
            } else {
                Result.Error(NetworkError.NO_CACHED_DATA)
            }
        } catch (e: Exception) {
            Result.Error(NetworkError.SERVER_ERROR)
        }
    }

    override suspend fun getForecastWeather(
        apiKey: String,
        city: String,
        days: Int
    ): Result<ForecastDomainModel, NetworkError> {
        return try {
            val forecastWithDays = weatherDao.getForecastWeather(city)
            if (forecastWithDays != null) {
                val location = weatherDao.getLocationWeather(city)?.toDomainModel()
                val currentWeather = weatherDao.getCurrentWeather(city)?.toDomainModel()
                if (location != null && currentWeather != null) {
                    val current = currentWeather.current
                    Result.Success(forecastWithDays.toDomainModel(location, current))
                } else {
                    Result.Error(NetworkError.NO_CACHED_DATA)
                }
            } else {
                Result.Error(NetworkError.NO_CACHED_DATA)
            }
        } catch (e: Exception) {
            Result.Error(NetworkError.SERVER_ERROR)
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
