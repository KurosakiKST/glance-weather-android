package com.ryan.weather.forecast.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.ryan.weather.core.navigation.ComposableNavigationDestination
import com.ryan.weather.core.navigation.Routes
import com.ryan.weather.forecast.presentation.detail.DetailScreen
import com.ryan.weather.forecast.presentation.home.HomeScreen
import com.ryan.weather.forecast.presentation.welcome.WelcomeScreen

object WelcomeDestination : ComposableNavigationDestination {
    override val route = Routes.WelcomeScreen.route

    @Composable
    override fun Content(navController: NavHostController) {
        WelcomeScreen(navController)
    }
}

object HomeDestination : ComposableNavigationDestination {
    override val route = Routes.HomeScreen.route

    @Composable
    override fun Content(navController: NavHostController) {
        HomeScreen(navController)
    }
}

object DetailDestination : ComposableNavigationDestination {
    override val route = Routes.DetailScreen.route

    @Composable
    override fun Content(navController: NavHostController) {
        DetailScreen(navController)
    }
}