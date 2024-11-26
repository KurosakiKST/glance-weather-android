<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/data/remote/dto/CityDto.kt
package com.ryan.weather.forecast.data.remote.dto
========
package com.ryan.weather.weather.data.remote.dto
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/data/remote/dto/CityDto.kt

import com.google.gson.annotations.SerializedName

data class CityDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("region")
    val region: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("lat")
    val lat: Double,
    @SerializedName("lon")
    val lon: Double,
    @SerializedName("url")
    val url: String
)