<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/data/local/database/entity/weather/LocationWeatherEntity.kt
package com.ryan.weather.forecast.data.local.database.entity.weather
========
package com.ryan.weather.weather.data.local.database.entity.weather
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/data/local/database/entity/weather/LocationWeatherEntity.kt

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "location_weather")
data class LocationWeatherEntity(
    @PrimaryKey
    val city: String,
    val region: String,
    val country: String,
    val localtimeEpoch: Long,
    val localtime: String
)