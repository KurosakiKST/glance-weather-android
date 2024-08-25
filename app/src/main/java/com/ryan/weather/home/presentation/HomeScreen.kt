package com.ryan.weather.home.presentation

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Card
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.ryan.weather.core.presentation.components.BackgroundImageContainer
import com.ryan.weather.core.presentation.components.ProgressDialog
import com.ryan.weather.core.presentation.components.SearchTextField
import com.ryan.weather.core.presentation.components.TextBody2
import com.ryan.weather.core.presentation.components.TextH5
import com.ryan.weather.home.presentation.components.WeatherItem
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

    var currentWeather by remember { mutableStateOf<WeatherUIModel?>(null) }
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

    LaunchedEffect(key1 = Unit, block = {
        scope.launch {
            viewModel.weatherState.collect {
                when (it) {
                    is ViewState.Error -> {
                        showLoading = false
                        alertTitle = "Error"
                        alertMsg = it.error
                        showAlert = true
                        Log.i("Loading", showLoading.toString())
                    }

                    ViewState.Loading -> {
                        showLoading = true
                        Log.i("Loading", showLoading.toString())
                    }

                    ViewState.NoData -> {
                        showLoading = false
                        Log.i("Loading", showLoading.toString())
                    }

                    is ViewState.Success -> {
                        showLoading = false
                        currentWeather = it.data
                        Log.i("Loading", showLoading.toString())
                    }
                }
            }
        }
    })

    BackgroundImageContainer {
        showAlert()
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
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
                        .padding(horizontal = 8.dp),
                    value = searchCity,
                    onValueChange = {
                        searchCity = it
                    },
                    onSearch = {
                        viewModel.getCurrentWeather(
                            Constant.API_KEY,
                            searchCity
                        )
                    }
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            when (showLoading) {
                true -> showLoading = true
                false -> {
                    currentWeather?.let { CurrentWeatherDetailsView(it) }
                }
            }
        }
    }
}

@Composable
fun CurrentWeatherDetailsView(currentWeather: WeatherUIModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        TextH5(
            text = "Today",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(8.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        TextBody2(
            text = currentWeather.location.localtime.split("-")[0],
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(8.dp),
            fontWeight = FontWeight.Normal
        )

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextBody2(
                text = currentWeather.location.name,
                modifier = Modifier
                    .padding(8.dp),
                fontWeight = FontWeight.Medium
            )
            Spacer(modifier = Modifier.width(8.dp))
            TextBody2(
                text = currentWeather.location.country,
                modifier = Modifier
                    .padding(8.dp),
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Bottom
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                TextH5(
                    text = currentWeather.current.tempF.toString() + " °F",
                    modifier = Modifier
                        .padding(8.dp),
                )
                TextH5(
                    text = currentWeather.current.condition.text,
                    modifier = Modifier
                        .padding(8.dp),
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            AsyncImage(
                modifier = Modifier
                    .size(110.dp)
                    .weight(1f),
                model = "https:${currentWeather.current.condition.icon}".replace(
                    "64x64",
                    "128x128"
                ),
                contentDescription = "Condition",
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        Card {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    WeatherItem(
                        key = "Wind",
                        value = currentWeather.current.windKph.toString() + " km/h"
                    )
                    WeatherItem(
                        key = "Degree",
                        value = currentWeather.current.windDegree.toString() + " °"
                    )
                    WeatherItem(
                        key = "Direction",
                        value = currentWeather.current.windDir
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    WeatherItem(
                        key = "Cloud",
                        value = currentWeather.current.cloud.toString()
                    )
                    WeatherItem(
                        key = "Precipitation",
                        value = currentWeather.current.pressureIn.toString() + " in"
                    )
                    WeatherItem(
                        key = "Humidity",
                        value = currentWeather.current.humidity.toString()
                    )
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
