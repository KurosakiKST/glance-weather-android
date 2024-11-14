package com.ryan.weather.weather.presentation.home

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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ryan.weather.core.presentation.components.BackgroundImageContainer
import com.ryan.weather.core.presentation.components.ProgressDialog
import com.ryan.weather.core.presentation.components.SearchTextField
import com.ryan.weather.core.presentation.components.TextH6
import com.ryan.weather.weather.presentation.home.components.CurrentWeatherDetailsView
import com.ryan.weather.weather.presentation.home.components.ForecastDaysView
import com.ryan.weather.weather.presentation.models.CityUi
import com.ryan.weather.weather.presentation.models.ForecastDayUi
import com.ryan.weather.weather.presentation.models.WeatherUi
import com.ryan.weather.core.presentation.utils.NetWorkService
import com.ryan.weather.core.presentation.utils.ViewState
import com.ryan.weather.core.presentation.utils.toString
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(
    navController: NavHostController,
    viewModel: WeatherVM = hiltViewModel()
) {
    val scope = rememberCoroutineScope()

    val context = LocalContext.current

    var currentWeather by remember { mutableStateOf<WeatherUi?>(null) }
    var forecastDays by remember { mutableStateOf<List<ForecastDayUi>?>(emptyList()) }
    var cities by remember { mutableStateOf<List<CityUi>?>(emptyList()) }

    var searchCity by remember { mutableStateOf("") }

    var showAlert by remember { mutableStateOf(false) }
    var alertTitle by remember { mutableStateOf("") }
    var alertMsg by remember { mutableStateOf("") }
    var showLoading by remember { mutableStateOf(false) }

    var showOfflineData by remember { mutableStateOf(false) }

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
            viewModel.getCities(searchCity)
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
                        showOfflineData = true
                        alertTitle = "Error"
                        alertMsg = it.error.toString(context)
                        showAlert = true
                    }

                    ViewState.Loading -> {
                        showLoading = true
                        showOfflineData = false
                    }

                    ViewState.NoData -> {
                        showLoading = false
                        showOfflineData = false
                    }

                    is ViewState.Success -> {
                        showLoading = false
                        showOfflineData = false
                        currentWeather = it.data
                    }

                    is ViewState.Offline -> {
                        showLoading = false
                        currentWeather = it.data
                        showOfflineData = true
                    }
                }
            }
        }
        scope.launch {
            viewModel.forecastState.collect {
                when (it) {
                    is ViewState.Error -> {
                        showLoading = false
                        showOfflineData = true
                        alertTitle = "Error"
                        alertMsg = it.error.toString(context)
                        showAlert = true
                    }

                    ViewState.Loading -> {
                        showLoading = true
                        showOfflineData = false
                    }

                    ViewState.NoData -> {
                        showLoading = false
                        showOfflineData = false
                    }

                    is ViewState.Success -> {
                        showLoading = false
                        showOfflineData = false
                        forecastDays = it.data
                    }

                    is ViewState.Offline -> {
                        showLoading = false
                        forecastDays = it.data
                        showOfflineData = true
                    }
                }
            }
        }
        scope.launch {

            viewModel.locationState.collect {
                when (it) {
                    is ViewState.Error -> {
                        showLoading = false
                        showOfflineData = true
                        alertTitle = "Error"
                        alertMsg = it.error.toString(context)
                        showAlert = true
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

                    is ViewState.Offline -> {

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
                            NetWorkService.API_KEY,
                            searchCity
                        )
                        viewModel.getForecastedWeather(
                            NetWorkService.API_KEY,
                            searchCity,
                            5
                        )
                    },
                    onCitySelected = { city ->
                        searchCity = city.name
                        viewModel.getCurrentWeather(NetWorkService.API_KEY, searchCity)
                        viewModel.getForecastedWeather(NetWorkService.API_KEY, searchCity, 5)
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
                if (showLoading) {
                    showLoading = true
                } else if (showOfflineData) {
                    TextH6(
                        text = "Offline Data",
                        modifier = Modifier.padding(8.dp)
                    )
                    currentWeather?.let { CurrentWeatherDetailsView(it) }
                    forecastDays?.let { ForecastDaysView(it) }
                } else {
                    currentWeather?.let { CurrentWeatherDetailsView(it) }
                    forecastDays?.let { ForecastDaysView(it) }
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
