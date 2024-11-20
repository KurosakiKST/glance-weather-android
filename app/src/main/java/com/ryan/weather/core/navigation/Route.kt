package com.ryan.weather.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ryan.weather.weather.presentation.detail.DetailScreen
import com.ryan.weather.weather.presentation.home.HomeScreen
import com.ryan.weather.weather.presentation.splash.SplashScreen

@Composable
internal fun Route() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.SplashScreen.route) {
        composable(Routes.SplashScreen.route) {
            SplashScreen(navController)
        }
        composable(Routes.HomeScreen.route) {
            HomeScreen(navController)
        }
        composable(Routes.DetailScreen.route) {
            DetailScreen(navController)
        }
    }
}
sealed class Routes(val route: String) {
    object SplashScreen : Routes("splashScreen")

    object HomeScreen : Routes("homeScreen")

    object DetailScreen: Routes("detailScreen")
}