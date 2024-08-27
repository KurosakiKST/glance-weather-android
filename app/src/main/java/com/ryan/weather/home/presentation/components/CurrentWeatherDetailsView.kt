package com.ryan.weather.home.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.ryan.weather.core.presentation.components.TextBody1
import com.ryan.weather.core.presentation.components.TextBody2
import com.ryan.weather.core.presentation.components.TextH2
import com.ryan.weather.core.presentation.components.TextH5
import com.ryan.weather.core.presentation.components.TextH6
import com.ryan.weather.home.presentation.model.WeatherUIModel

@Composable
fun CurrentWeatherDetailsView(currentWeather: WeatherUIModel) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextH5(
                text = currentWeather.location.name,
                modifier = Modifier
                    .padding(8.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            TextBody1(
                text = currentWeather.location.country,
                modifier = Modifier
                    .padding(8.dp),
                fontWeight = FontWeight.Medium
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        TextH5(
            text = "Today",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(8.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextBody1(
            text = currentWeather.location.localtime,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(8.dp),
            fontWeight = FontWeight.Normal
        )

        Spacer(modifier = Modifier.height(8.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF081E56)),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
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
                        TextBody1(
                            text = currentWeather.current.condition.text,
                            modifier = Modifier
                                .padding(8.dp),
                            fontWeight = FontWeight.Bold
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
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    WeatherItem(
                        key = "Wind",
                        value = currentWeather.current.windKph.toString() + " km/h"
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
