package com.ryan.weather.home.data.remote

import com.ryan.weather.core.presentation.utils.NetWorkService
import com.ryan.weather.home.data.responsemodel.CityResponseModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface LocationAPIService {

    @GET(NetWorkService.CITIES)
    suspend fun getCities(
        @Query("key") apiKey: String,
        @Query("q") city: String
    ): Response<List<CityResponseModel>>

}