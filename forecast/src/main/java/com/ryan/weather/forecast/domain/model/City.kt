<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/domain/model/City.kt
package com.ryan.weather.forecast.domain.model
========
package com.ryan.weather.weather.domain.model
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/domain/model/City.kt

data class City(
    val id: Int,
    val name: String,
    val region: String,
    val country: String,
    val latitude: Double,
    val longitude: Double,
    val url: String
)
