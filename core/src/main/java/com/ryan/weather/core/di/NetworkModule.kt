package com.ryan.weather.di

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.google.gson.ExclusionStrategy
import com.google.gson.FieldAttributes
import com.google.gson.GsonBuilder
<<<<<<<< HEAD:core/src/main/java/com/ryan/weather/core/di/NetworkModule.kt
import com.ryan.weather.core.presentation.components.NetWorkService
========
import com.ryan.weather.weather.data.remote.LocationAPIService
import com.ryan.weather.weather.data.remote.WeatherAPIService
import com.ryan.weather.core.presentation.utils.NetWorkService
>>>>>>>> main:app/src/main/java/com/ryan/weather/di/NetworkModule.kt
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideOkHttpClient(chuckInterceptor: ChuckerInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(chuckInterceptor)
            .build()
    }

    @Provides
    @Singleton
    fun provideChuckInterceptor(@ApplicationContext context: Context): ChuckerInterceptor {
        return ChuckerInterceptor.Builder(context)
            .build()
    }

    private val gson = GsonBuilder()
        .setLenient()
        .apply {
            setExclusionStrategies(object : ExclusionStrategy {
                override fun shouldSkipField(f: FieldAttributes) = false
                override fun shouldSkipClass(clazz: Class<*>) = false
            })
        }
        .create()

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(NetWorkService.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}