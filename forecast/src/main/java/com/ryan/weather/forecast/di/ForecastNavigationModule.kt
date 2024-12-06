package com.ryan.weather.forecast.di

import com.ryan.weather.forecast.navigation.destinations.HomeDestination
import com.ryan.weather.forecast.navigation.destinations.WelcomeDestination
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ForecastNavigationModule {
    @Provides
    @Singleton
    fun provideWelcomeDestination(): WelcomeDestination = WelcomeDestination()

    @Provides
    @Singleton
    fun provideHomeDestination(): HomeDestination = HomeDestination()
}