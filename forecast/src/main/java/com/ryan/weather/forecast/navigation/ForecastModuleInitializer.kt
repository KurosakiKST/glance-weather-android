package com.ryan.weather.forecast.navigation

import com.ryan.weather.core.navigation.NavigationRegistry
import com.ryan.weather.forecast.navigation.destinations.HomeDestination
import com.ryan.weather.forecast.navigation.destinations.WelcomeDestination
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ForecastModuleInitializer @Inject constructor(
    private val navigationRegistry: NavigationRegistry,
    private val welcomeDestination: WelcomeDestination,
    private val homeDestination: HomeDestination
) {
    fun initialize() {
        navigationRegistry.register(welcomeDestination)
        navigationRegistry.register(homeDestination)
    }
}