package com.ryan.weather.core.di

import com.ryan.weather.core.navigation.NavigationManager
import com.ryan.weather.core.navigation.NavigationRegistry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NavigationModule {
    @Provides
    @Singleton
    fun provideNavigationRegistry(): NavigationRegistry = NavigationRegistry()

    @Provides
    @Singleton
    fun provideNavigationManager(): NavigationManager = NavigationManager()
}