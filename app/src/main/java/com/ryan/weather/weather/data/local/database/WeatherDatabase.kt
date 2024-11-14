package com.ryan.weather.weather.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.ryan.weather.weather.data.local.database.dao.WeatherDao
import com.ryan.weather.weather.data.local.database.entity.weather.CurrentWeatherEntity
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastDayEntity
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastWeatherEntity
import com.ryan.weather.weather.data.local.database.entity.weather.LocationWeatherEntity

@Database(
    entities = [CurrentWeatherEntity::class,
        ForecastWeatherEntity::class,
        LocationWeatherEntity::class,
        ForecastDayEntity::class
    ],
    version = 2,
    exportSchema = false
)
abstract class WeatherDatabase : RoomDatabase() {
    abstract fun weatherDao(): WeatherDao
}