package com.ryan.weather.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

interface NavigationDestination {
    val route: String
}

interface ComposableNavigationDestination : NavigationDestination {
    @Composable
    fun Content(navController: NavHostController)
}