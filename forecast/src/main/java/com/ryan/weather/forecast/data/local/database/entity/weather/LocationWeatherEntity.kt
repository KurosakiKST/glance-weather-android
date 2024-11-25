package com.ryan.weather.forecast.data.local.database.entity.weather

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