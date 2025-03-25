package com.ryan.weather.feature.home

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun HomeRoute(
    viewModel: HomeViewModel = hiltViewModel()
) {
//    val state by viewModel.state.collectAsState()
//
//    HomeScreen(
//        state = state,
//        onEvent = viewModel::onEvent,
//        onArticleClick = onArticleClick
//    )
    HomeScreen(
        viewModel = viewModel
    )
}