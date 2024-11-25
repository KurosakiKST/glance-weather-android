package com.ryan.weather.forecast.navigation

import com.ryan.weather.core.navigation.NavigationRegistry

object ForecastModuleInitializer {
    fun registerDestinations() {
        NavigationRegistry.addDestination(SplashDestination)
        NavigationRegistry.addDestination(HomeDestination)
        NavigationRegistry.addDestination(DetailDestination)
    }
}