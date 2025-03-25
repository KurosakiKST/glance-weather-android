package com.ryan.weather.forecast.navigation.destinations

import androidx.compose.runtime.Composable
import com.ryan.weather.core.navigation.NavigationCommand
import com.ryan.weather.core.navigation.NavigationDestination
import com.ryan.weather.core.navigation.NavigationManager
import com.ryan.weather.core.navigation.Route
import com.ryan.weather.forecast.presentation.welcome.WelcomeScreen
import javax.inject.Inject

class WelcomeDestination @Inject constructor() : NavigationDestination {
    override val route = Route.Welcome

    @Composable
    override fun Content(navigationManager: NavigationManager) {
        WelcomeScreen(navigationManager)
    }
}