package com.ryan.weather.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ryan.weather.feature.home.HomeRoute
import com.ryan.weather.feature.welcome.WelcomeRoute

@Composable
fun GlanceNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Welcome.route,
        modifier = modifier
    ) {
        composable(Routes.Welcome.route) {
            WelcomeRoute(
                onStartButtonClick = {
                    navController.navigate(Routes.Home.route) {
                        popUpTo(Routes.Welcome.route) { inclusive = true }
                    }
                }
            )
        }
        composable(Routes.Home.route) {
            HomeRoute(

            )
        }
        composable(Routes.Search.route) {
            HomeRoute(

            )
        }
        composable(Routes.MyCities.route) {
            HomeRoute(

            )
        }
    }
}