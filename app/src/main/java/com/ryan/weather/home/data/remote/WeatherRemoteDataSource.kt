package com.ryan.weather.home.data.remote

import android.util.Log
import com.google.gson.Gson
import com.ryan.weather.core.data.RequestErrorHandler
import com.ryan.weather.home.data.datasource.WeatherDataSource
import com.ryan.weather.home.data.local.database.entity.weather.CurrentWeatherEntity
import com.ryan.weather.home.data.mappers.toDomainModel
import com.ryan.weather.home.data.responsemodel.ErrorModel
import com.ryan.weather.home.data.responsemodel.ErrorResponseModel
import com.ryan.weather.home.domain.model.ForecastDomainModel
import com.ryan.weather.home.domain.model.WeatherDomainModel
import com.ryan.weather.core.presentation.utils.WResult
import com.ryan.weather.home.data.local.database.entity.weather.ForecastDayEntity
import com.ryan.weather.home.data.local.database.entity.weather.ForecastWeatherEntity
import com.ryan.weather.home.data.local.database.entity.weather.LocationWeatherEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class WeatherRemoteDataSource @Inject constructor(
    private val weatherAPIService: WeatherAPIService
) : WeatherDataSource {
    override suspend fun getCurrentWeather(
        apiKey: String,
        city: String
    ): WResult<WeatherDomainModel> {
        return withContext(Dispatchers.IO) {
            try {
                val response = weatherAPIService.getCurrentWeather(apiKey, city)
                if (response.isSuccessful) {
                    val weatherResult = response.body()?.toDomainModel()
                    if (weatherResult != null) {
                        WResult.Success(weatherResult)
                    } else {
                        WResult.Failure(
                            RequestErrorHandler.getApiError(
                                ErrorResponseModel(
                                    ErrorModel(-1, "Invalid data")
                                )
                            )
                        )
                    }
                } else {
                    val errorBody = response.errorBody()?.string()
                    val errorResponse = Gson().fromJson(errorBody, ErrorResponseModel::class.java)
                    WResult.Failure(RequestErrorHandler.getApiError(errorResponse))
                }
            } catch (e: Exception) {
                Log.e("WeatherRemoteDataSource", "Network error", e)
                WResult.Failure(RequestErrorHandler.getRequestError(e))
            }
        }
    }

    override suspend fun getForecastWeather(
        apiKey: String,
        city: String,
        days: Int
    ): WResult<ForecastDomainModel> {
        return withContext(Dispatchers.IO) {
            try {
                val response = weatherAPIService.getForeCastWeather(apiKey, city, days)
                if (response.isSuccessful) {
                    val weatherResult = response.body()?.toDomainModel()
                    if (weatherResult != null) {
                        WResult.Success(weatherResult)
                    } else {
                        WResult.Failure(
                            RequestErrorHandler.getApiError(
                                ErrorResponseModel(
                                    ErrorModel(-1, "Invalid data")
                                )
                            )
                        )
                    }
                } else {
                    val errorBody = response.errorBody()?.string()
                    val errorResponse = Gson().fromJson(errorBody, ErrorResponseModel::class.java)
                    WResult.Failure(RequestErrorHandler.getApiError(errorResponse))
                }
            } catch (e: Exception) {
                Log.e("WeatherRemoteDataSource", "Network error", e)
                WResult.Failure(RequestErrorHandler.getRequestError(e))
            }
        }
    }

    override suspend fun addCurrentWeather(weather: CurrentWeatherEntity) {

    }

    override suspend fun addForecastWeather(forecast: ForecastWeatherEntity) {

    }

    override suspend fun addLocationWeather(locationEntity: LocationWeatherEntity) {

    }

    override suspend fun addForecastDays(forecastDays: List<ForecastDayEntity>) {

    }
}