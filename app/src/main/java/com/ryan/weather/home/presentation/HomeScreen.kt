package com.ryan.weather.home.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ryan.weather.core.presentation.components.BackgroundImageContainer
import com.ryan.weather.core.presentation.components.ProgressDialog
import com.ryan.weather.core.presentation.components.SearchTextField
import com.ryan.weather.home.presentation.components.CurrentWeatherDetailsView
import com.ryan.weather.home.presentation.components.ForecastDaysView
import com.ryan.weather.home.presentation.model.CityUIModel
import com.ryan.weather.home.presentation.model.ForecastDayUIModel
import com.ryan.weather.home.presentation.model.WeatherUIModel
import com.ryan.weather.home.viewmodel.WeatherVM
import com.ryan.weather.core.utils.Constants
import com.ryan.weather.core.utils.ViewState
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(
    navController: NavHostController,
    viewModel: WeatherVM = hiltViewModel()
) {
    val scope = rememberCoroutineScope()

    var currentWeather by remember { mutableStateOf<WeatherUIModel?>(null) }
    var forecastDays by remember { mutableStateOf<List<ForecastDayUIModel>?>(emptyList()) }
    var cities by remember { mutableStateOf<List<CityUIModel>?>(emptyList()) }

    var searchCity by remember { mutableStateOf("") }

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

    LaunchedEffect(key1 = searchCity) {
        if (searchCity.length > 2) {
            viewModel.getCities(Constants.API_KEY, searchCity)
        } else {
            cities = null
        }
    }

    LaunchedEffect(key1 = Unit) {
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
        scope.launch {
            viewModel.forecastState.collect {
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
                        forecastDays = it.data
                    }
                }
            }
        }
        scope.launch {

            viewModel.locationState.collect {
                when (it) {
                    is ViewState.Error -> {
                        // Handle error
                    }

                    ViewState.Loading -> {
                        // Handle loading
                    }

                    ViewState.NoData -> {
                        // Handle no data
                    }

                    is ViewState.Success -> {
                        cities = it.data
                    }
                }
            }
        }
    }

    BackgroundImageContainer {
        showAlert()
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                SearchTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    value = searchCity,
                    cities = cities,
                    onValueChange = {
                        searchCity = it
                    },
                    onSearch = {
                        viewModel.getCurrentWeather(
                            Constants.API_KEY,
                            searchCity
                        )
                        viewModel.getForeCastWeather(
                            Constants.API_KEY,
                            searchCity,
                            5
                        )
                    },
                    onCitySelected = { city ->
                        searchCity = city.name
                        viewModel.getCurrentWeather(Constants.API_KEY, searchCity)
                        viewModel.getForeCastWeather(Constants.API_KEY, searchCity, 5)
                        searchCity = ""
                        cities = null
                    },
                    onClearCityList = {
                        cities = null
                    }
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                when (showLoading) {
                    true -> showLoading = true
                    false -> {
                        currentWeather?.let { CurrentWeatherDetailsView(it) }
                        forecastDays?.let { ForecastDaysView(it) }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen(
        navController = rememberNavController(),
        viewModel = hiltViewModel()
    )
}
