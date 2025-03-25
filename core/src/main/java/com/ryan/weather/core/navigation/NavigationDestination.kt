package com.ryan.weather.core.navigation

import androidx.compose.runtime.Composable

interface NavigationDestination {
    val route: Route

    @Composable
    fun Content(
        navigationManager: NavigationManager
    )
}