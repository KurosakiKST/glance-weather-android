package com.ryan.weather.home.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.ryan.weather.core.presentation.components.ProgressDialog
import com.ryan.weather.home.presentation.model.CurrentUIModel
import com.ryan.weather.home.presentation.model.WeatherUIModel
import com.ryan.weather.home.viewmodel.WeatherVM
import com.ryan.weather.util.Constant
import com.ryan.weather.util.ViewState
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(
    navController: NavHostController,
    viewModel: WeatherVM = hiltViewModel()
) {
    val scope = rememberCoroutineScope()
    val context = LocalContext.current

    var currentWeather by remember { mutableStateOf<WeatherUIModel?>(null) }

    var showAlert by remember { mutableStateOf(false) }
    var alertTitle by remember { mutableStateOf("") }
    var alertMsg by remember { mutableStateOf("") }
    var showLoading by remember { mutableStateOf(false) }

    @Composable
    fun showAlert() {
        if (showAlert) {
            AlertDialog(
                onDismissRequest = { },
                title = { Text(text = alertTitle) },
                text = { Text(text = alertMsg) },
                dismissButton = {
                },
                confirmButton = {
                    TextButton(onClick = { showAlert = false }) {
                        Text(text = "OK")
                    }
                },
                modifier = Modifier.clip(RoundedCornerShape(size = 20.dp))
            )
        }
        if (showLoading) {
            ProgressDialog {
                showLoading = false
            }
        }
    }

    LaunchedEffect(key1 = Unit, block = {
        viewModel.getCurrentWeather(
            Constant.API_KEY,
            "Yangon"
        )
        scope.launch {
            viewModel.weatherState.collect {
                when (it) {
                    is ViewState.Error -> {
                        showLoading = false
                        alertTitle = "Error"
                        alertMsg = it.error
                        showAlert = true
                    }

                    ViewState.Loading -> {
                        showLoading = true
                    }

                    ViewState.NoData -> {
                        showLoading = false
                    }

                    is ViewState.Success -> {
                        showLoading = false
                        currentWeather = it.data
                    }
                }
            }
        }
    })

    Scaffold { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            showAlert()
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                currentWeather?.current?.condition?.let {
                    Text(
                        text = it.text
                    )
                }
            }
        }
    }
}