package com.ryan.weather.core.services

import com.ryan.weather.home.data.responsemodel.WeatherResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPIService {

    @GET("/v1/current.json")
    suspend fun getCurrentWeather(
        @Query("key") apiKey: String,
        @Query("q") city: String
    ) : Response<WeatherResponseModel>

}