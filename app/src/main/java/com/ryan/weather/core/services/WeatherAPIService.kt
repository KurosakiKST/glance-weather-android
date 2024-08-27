package com.ryan.weather.core.services

import com.ryan.weather.core.utils.NetWorkService
import com.ryan.weather.home.data.responsemodel.ForecastResponseModel
import com.ryan.weather.home.data.responsemodel.WeatherResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPIService {

    @GET(NetWorkService.CURRENT_WEATHER)
    suspend fun getCurrentWeather(
        @Query("key") apiKey: String,
        @Query("q") city: String
    ) : Response<WeatherResponseModel>

    @GET(NetWorkService.FORECAST_WEATHER)
    suspend fun getForeCastWeather(
        @Query("key") apiKey: String,
        @Query("q") city: String,
        @Query("days") days: Int,
    ): Response<ForecastResponseModel>

}