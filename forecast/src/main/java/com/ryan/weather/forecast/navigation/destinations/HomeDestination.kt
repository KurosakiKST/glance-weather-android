package com.ryan.weather.forecast.navigation.destinations

import androidx.compose.runtime.Composable
import com.ryan.weather.core.navigation.NavigationDestination
import com.ryan.weather.core.navigation.NavigationManager
import com.ryan.weather.core.navigation.Route
import com.ryan.weather.forecast.presentation.home.HomeScreen
import javax.inject.Inject

class HomeDestination @Inject constructor() : NavigationDestination {
    override val route = Route.Home

    @Composable
    override fun Content(navigationManager: NavigationManager) {
        HomeScreen(navigationManager)
    }
}