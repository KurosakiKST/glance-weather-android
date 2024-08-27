package com.ryan.weather.home.data.local.database.entity.weather

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