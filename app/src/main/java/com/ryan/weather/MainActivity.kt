package com.ryan.weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ryan.weather.core.navigation.NavigationManager
import com.ryan.weather.core.navigation.NavigationRegistry
import com.ryan.weather.core.presentation.theme.WeatherAppTheme
import com.ryan.weather.forecast.navigation.ForecastModuleInitializer
import com.ryan.weather.navigation.AppNavigation
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @Inject
    lateinit var navigationRegistry: NavigationRegistry

    @Inject
    lateinit var navigationManager: NavigationManager

    @Inject
    lateinit var forecastModuleInitializer: ForecastModuleInitializer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        forecastModuleInitializer.initialize()

        setContent {
            WeatherAppTheme {
                AppNavigation(
                    navigationRegistry = navigationRegistry,
                    navigationManager = navigationManager
                )
            }
        }
    }
}
