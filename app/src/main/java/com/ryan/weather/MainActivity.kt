package com.ryan.weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.ryan.weather.core.presentation.theme.WeatherAppTheme
import com.ryan.weather.navigation.BottomNavbar
import com.ryan.weather.navigation.GlanceNavHost
import com.ryan.weather.navigation.Routes
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                val navController = rememberNavController()
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route

                val showBottomBar = when (currentRoute) {
                    Routes.Home.route, Routes.Search.route, Routes.MyCities.route -> true
                    else -> false
                }

                Scaffold(
                    bottomBar = {
                        if (showBottomBar) {
                            BottomNavbar(navController = navController)
                        }
                    }
                ) { paddingValues ->
                    GlanceNavHost(
                        navController = navController,
                        modifier = Modifier.padding(paddingValues)
                    )
                }
            }
        }
    }
}