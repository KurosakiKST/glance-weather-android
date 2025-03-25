package com.ryan.weather.feature.welcome

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun WelcomeRoute(
    onStartButtonClick: () -> Unit,
    viewModel: WelcomeViewModel = hiltViewModel()
) {
    WelcomeScreen(
        onStartButtonClick = onStartButtonClick,
        viewModel = viewModel
    )
}