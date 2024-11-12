package com.ryan.weather.weather.data.local.database.entity.weather

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "location_weather")
data class LocationWeatherEntity(
    @PrimaryKey
    val city: String,
    val region: String,
    val country: String,
    val latitude: Double,
    val longitude: Double,
    val timezone: String,
    val localtimeEpoch: Long,
    val localtime: String
)