<<<<<<<< HEAD:forecast/src/main/java/com/ryan/weather/forecast/di/RoomModule.kt
package com.ryan.weather.forecast.di

import android.content.Context
import androidx.room.Room
import com.ryan.weather.core.presentation.components.Database
import com.ryan.weather.forecast.data.local.database.WeatherDatabase
========
package com.ryan.weather.di

import android.content.Context
import androidx.room.Room
import com.ryan.weather.core.presentation.utils.Database
import com.ryan.weather.weather.data.local.database.WeatherDatabase
>>>>>>>> main:app/src/main/java/com/ryan/weather/di/RoomModule.kt
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {
    @Provides
    @Singleton
    fun provideRoomDatabase(@ApplicationContext context: Context): WeatherDatabase {
        return Room.databaseBuilder(context, WeatherDatabase::class.java, Database.DATABASE_NAME)
            .allowMainThreadQueries()
            .build()
    }
}