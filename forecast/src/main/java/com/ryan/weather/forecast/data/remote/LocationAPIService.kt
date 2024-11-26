<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/data/remote/LocationAPIService.kt
package com.ryan.weather.forecast.data.remote

import com.ryan.weather.core.presentation.components.NetWorkService
import com.ryan.weather.forecast.data.remote.dto.CityDto
========
package com.ryan.weather.weather.data.remote

import com.ryan.weather.core.presentation.utils.NetWorkService
import com.ryan.weather.weather.data.remote.dto.CityDto
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/data/remote/LocationAPIService.kt
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface LocationAPIService {

    @GET(NetWorkService.CITIES)
    suspend fun getCities(
        @Query("key") apiKey: String,
        @Query("q") city: String
    ): Response<List<CityDto>>

}