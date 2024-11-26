<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/data/local/database/entity/weather/ForecastWeatherWithDays.kt
package com.ryan.weather.forecast.data.local.database.entity.weather
========
package com.ryan.weather.weather.data.local.database.entity.weather
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/data/local/database/entity/weather/ForecastWeatherWithDays.kt

import androidx.room.Embedded
import androidx.room.Relation

data class ForecastWeatherWithDays(
    @Embedded val forecastWeather: ForecastWeatherEntity,
    @Relation(
        parentColumn = "city",
        entityColumn = "city"
    )
    val forecastDays: List<ForecastDayEntity>
)