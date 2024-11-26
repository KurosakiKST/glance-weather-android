<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/data/local/database/dao/WeatherDao.kt
package com.ryan.weather.forecast.data.local.database.dao

========
package com.ryan.weather.weather.data.local.database.dao

import com.ryan.weather.weather.data.local.database.entity.weather.CurrentWeatherEntity
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/data/local/database/dao/WeatherDao.kt
import androidx.room.Dao
import androidx.room.Embedded
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Relation
import androidx.room.Transaction
<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/data/local/database/dao/WeatherDao.kt
import com.ryan.weather.forecast.data.local.database.entity.weather.CurrentWeatherEntity
import com.ryan.weather.forecast.data.local.database.entity.weather.ForecastDayEntity
import com.ryan.weather.forecast.data.local.database.entity.weather.ForecastWeatherEntity
import com.ryan.weather.forecast.data.local.database.entity.weather.ForecastWeatherWithDays
import com.ryan.weather.forecast.data.local.database.entity.weather.LocationWeatherEntity
========
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastDayEntity
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastWeatherEntity
import com.ryan.weather.weather.data.local.database.entity.weather.ForecastWeatherWithDays
import com.ryan.weather.weather.data.local.database.entity.weather.LocationWeatherEntity
>>>>>>>> main:app/src/main/java/com/ryan/weather/weather/data/local/database/dao/WeatherDao.kt

@Dao
interface WeatherDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWeather(weather: CurrentWeatherEntity)

    @Query("SELECT * FROM weather WHERE city = :city")
    suspend fun getWeather(city: String): CurrentWeatherEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertForecastWeather(forecastWeather: ForecastWeatherEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertForecastDays(forecastDays: List<ForecastDayEntity>)

    @Transaction
    @Query("SELECT * FROM forecast_weather WHERE city = :city")
    suspend fun getForecastWeather(city: String): ForecastWithDays?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLocationWeather(locationWeather: LocationWeatherEntity)

    @Query("SELECT * FROM location_weather WHERE city = :city")
    suspend fun getLocationWeather(city: String): LocationWeatherEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCurrentWeather(currentWeather: CurrentWeatherEntity)

    @Query("SELECT * FROM weather WHERE city = :city")
    suspend fun getCurrentWeather(city: String): CurrentWeatherEntity?

    @Transaction
    @Query("SELECT * FROM forecast_weather WHERE city = :city")
    fun getForecastWeatherWithDays(city: String): ForecastWeatherWithDays
}

data class ForecastWithDays(
    @Embedded val forecast: ForecastWeatherEntity,
    @Relation(
        parentColumn = "city",
        entityColumn = "city"
    )
    val days: List<ForecastDayEntity>
)