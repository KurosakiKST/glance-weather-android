package com.ryan.weather.home.presentation.splash

import android.widget.ImageView
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import com.ryan.weather.R
import com.ryan.weather.core.nav.Routes
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navController: NavHostController
) {
    LaunchedEffect(key1 = Unit) {
        delay(2000)
        navController.navigate(Routes.HomeScreen.route) { popUpTo(0) }
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        AndroidView(
            factory = { context ->
                ImageView(context).apply {
                    setImageResource(R.mipmap.ic_launcher_round)
                }
            },
            update = {
                it.setImageResource(R.mipmap.ic_launcher_round)
            }
        )
    }
}