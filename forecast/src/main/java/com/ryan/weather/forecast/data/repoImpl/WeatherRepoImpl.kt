<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/data/repoImpl/WeatherRepoImpl.kt
package com.ryan.weather.forecast.data.repoImpl

import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.core.domain.utils.NetworkResult
import com.ryan.weather.core.presentation.components.NetWorkService.API_KEY
import com.ryan.weather.forecast.data.local.database.mapper.WeatherEntityMapper.toEntity
import com.ryan.weather.forecast.data.local.datasource.WeatherLocalDataSource
import com.ryan.weather.forecast.data.remote.WeatherRemoteDataSource
import com.ryan.weather.forecast.domain.model.Forecast
import com.ryan.weather.forecast.domain.model.Weather
import com.ryan.weather.forecast.domain.repository.WeatherRepository
========
package com.ryan.weather.weather.data.repoImpl

import com.ryan.weather.BuildConfig
import com.ryan.weather.weather.data.local.database.mapper.WeatherEntityMapper.toEntity
import com.ryan.weather.weather.domain.model.Forecast
import com.ryan.weather.weather.domain.model.Weather
import com.ryan.weather.weather.domain.repository.WeatherRepository
import com.ryan.weather.core.domain.utils.Result
import com.ryan.weather.core.domain.utils.NetworkError
import com.ryan.weather.weather.data.local.datasource.WeatherLocalDataSource
import com.ryan.weather.weather.data.remote.WeatherRemoteDataSource
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/data/repoImpl/WeatherRepoImpl.kt
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WeatherRepoImpl @Inject constructor(
    private val weatherRemoteDataSource: WeatherRemoteDataSource,
    private val weatherLocalDataSource: WeatherLocalDataSource
) : WeatherRepository {

    override suspend fun getCurrentWeather(
        city: String
<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/data/repoImpl/WeatherRepoImpl.kt
    ): NetworkResult<Weather, NetworkError> {
        return try {
            val localData = weatherLocalDataSource.getCurrentWeather(
                apiKey = API_KEY,
                city
            )
            if (localData is NetworkResult.Success) {
                localData
            } else {
                val remoteData = weatherRemoteDataSource.getCurrentWeather(
                    apiKey = API_KEY,
                    city
                )
                if (remoteData is NetworkResult.Success) {
========
    ): Result<Weather, NetworkError> {
        return try {
            val localData = weatherLocalDataSource.getCurrentWeather(
                apiKey = BuildConfig.API_KEY,
                city
            )
            if (localData is Result.Success) {
                localData
            } else {
                val remoteData = weatherRemoteDataSource.getCurrentWeather(
                    apiKey = BuildConfig.API_KEY,
                    city
                )
                if (remoteData is Result.Success) {
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/data/repoImpl/WeatherRepoImpl.kt
                    weatherLocalDataSource.addCurrentWeather(remoteData.data.toEntity())
                }
                remoteData
            }
        } catch (e: Exception) {
<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/data/repoImpl/WeatherRepoImpl.kt
            NetworkResult.Error(NetworkError.UNKNOWN)
========
            Result.Error(NetworkError.UNKNOWN)
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/data/repoImpl/WeatherRepoImpl.kt
        }
    }

    override suspend fun getForeCastWeather(
        city: String,
        days: Int
<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/data/repoImpl/WeatherRepoImpl.kt
    ): NetworkResult<Forecast, NetworkError> {
        return try {
            val localData = weatherLocalDataSource.getForecastWeather(
                apiKey = API_KEY,
                city,
                days
            )
            if (localData is NetworkResult.Success) {
                localData
            } else {
                val remoteData = weatherRemoteDataSource.getForecastWeather(
                    apiKey = API_KEY,
                    city,
                    days
                )
                if (remoteData is NetworkResult.Success) {
========
    ): Result<Forecast, NetworkError> {
        return try {
            val localData = weatherLocalDataSource.getForecastWeather(
                apiKey = BuildConfig.API_KEY,
                city,
                days
            )
            if (localData is Result.Success) {
                localData
            } else {
                val remoteData = weatherRemoteDataSource.getForecastWeather(
                    apiKey = BuildConfig.API_KEY,
                    city,
                    days
                )
                if (remoteData is Result.Success) {
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/data/repoImpl/WeatherRepoImpl.kt
                    val locationEntity = remoteData.data.location.toEntity()
                    val currentEntity = remoteData.data.current.toEntity(remoteData.data.location)
                    val forecastEntity = remoteData.data.toEntity(city)
                    weatherLocalDataSource.addForecastWeather(forecastEntity)
                    val forecastDayEntities =
                        remoteData.data.forecast.forecastDays.map { forecastDay ->
                            val forecastDayEntity = forecastDay.toEntity()
                            forecastDayEntity.city = city
                            forecastDayEntity
                        }
                    weatherLocalDataSource.addForecastDays(forecastDayEntities)
                    weatherLocalDataSource.addLocationWeather(locationEntity)
                    weatherLocalDataSource.addCurrentWeather(currentEntity)
                }
                remoteData
            }
        } catch (e: Exception) {
<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/data/repoImpl/WeatherRepoImpl.kt
            NetworkResult.Error(NetworkError.UNKNOWN)
========
            Result.Error(NetworkError.UNKNOWN)
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/data/repoImpl/WeatherRepoImpl.kt
        }
    }
}
