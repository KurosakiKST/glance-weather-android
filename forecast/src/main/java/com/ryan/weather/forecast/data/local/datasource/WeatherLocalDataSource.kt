<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/data/local/datasource/WeatherLocalDataSource.kt
package com.ryan.weather.forecast.data.local.datasource

import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.forecast.data.datasource.WeatherDataSource
import com.ryan.weather.forecast.data.local.database.dao.WeatherDao
import com.ryan.weather.forecast.data.local.database.entity.weather.CurrentWeatherEntity
import com.ryan.weather.forecast.data.local.database.entity.weather.ForecastDayEntity
import com.ryan.weather.forecast.data.local.database.entity.weather.ForecastWeatherEntity
import com.ryan.weather.forecast.data.local.database.entity.weather.LocationWeatherEntity
import com.ryan.weather.forecast.data.local.database.mapper.WeatherEntityMapper.toDomainModel
import com.ryan.weather.forecast.domain.model.Forecast
import com.ryan.weather.forecast.domain.model.Weather
========
package com.ryan.weather.weather.data.local.datasource

import com.ryan.weather.weather.data.datasource.WeatherDataSource
import com.ryan.weather.weather.data.local.database.dao.WeatherDao
import com.ryan.weather.weather.data.local.database.entity.weather.CurrentWeatherEntity
import com.ryan.weather.weather.data.local.database.mapper.WeatherEntityMapper.toDomainModel
import com.ryan.weather.weather.domain.model.Forecast
import com.ryan.weather.weather.domain.model.Weather
import com.ryan.weather.core.domain.utils.Result
import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastDayEntity
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastWeatherEntity
import com.ryan.weather.weather.data.local.database.entity.weather.LocationWeatherEntity
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/data/local/datasource/WeatherLocalDataSource.kt
import javax.inject.Inject

class WeatherLocalDataSource @Inject constructor(
    private val weatherDao: WeatherDao
) : WeatherDataSource {

    override suspend fun getCurrentWeather(
        apiKey: String,
        city: String
<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/data/local/datasource/WeatherLocalDataSource.kt
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
========
    ): Result<Weather, NetworkError> {
        return try {
            val weatherEntity = weatherDao.getWeather(city)
            if (weatherEntity != null) {
                Result.Success(weatherEntity.toDomainModel())
            } else {
                Result.Error(NetworkError.NO_CACHED_DATA)
            }
        } catch (e: Exception) {
            Result.Error(NetworkError.SERVER_ERROR)
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/data/local/datasource/WeatherLocalDataSource.kt
        }
    }

    override suspend fun getForecastWeather(
        apiKey: String,
        city: String,
        days: Int
<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/data/local/datasource/WeatherLocalDataSource.kt
    ): NetworkResult<Forecast, NetworkError> {
========
    ): Result<Forecast, NetworkError> {
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/data/local/datasource/WeatherLocalDataSource.kt
        return try {
            val forecastWithDays = weatherDao.getForecastWeather(city)
            if (forecastWithDays != null) {
                val location = weatherDao.getLocationWeather(city)?.toDomainModel()
                val currentWeather = weatherDao.getCurrentWeather(city)?.toDomainModel()
                if (location != null && currentWeather != null) {
                    val current = currentWeather.current
<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/data/local/datasource/WeatherLocalDataSource.kt
                    NetworkResult.Success(forecastWithDays.toDomainModel(location, current))
                } else {
                    NetworkResult.Error(NetworkError.NO_CACHED_DATA)
                }
            } else {
                NetworkResult.Error(NetworkError.NO_CACHED_DATA)
            }
        } catch (e: Exception) {
            NetworkResult.Error(NetworkError.SERVER_ERROR)
========
                    Result.Success(forecastWithDays.toDomainModel(location, current))
                } else {
                    Result.Error(NetworkError.NO_CACHED_DATA)
                }
            } else {
                Result.Error(NetworkError.NO_CACHED_DATA)
            }
        } catch (e: Exception) {
            Result.Error(NetworkError.SERVER_ERROR)
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/data/local/datasource/WeatherLocalDataSource.kt
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
