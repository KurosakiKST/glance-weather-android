package com.ryan.weather.home.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ryan.weather.core.presentation.components.TextBody1
import com.ryan.weather.core.presentation.components.TextH5
import com.ryan.weather.home.presentation.model.ForecastDayUIModel

@Composable
fun ForecastDaysView(forecastDays: List<ForecastDayUIModel>) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        forecastDays.forEach { forecastDay ->
            ForecastDayView(forecastDay)
        }
    }
}

@Composable
fun ForecastDayView(forecastDay: ForecastDayUIModel) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextH5(text = forecastDay.date)
        TextBody1(text = "${forecastDay.day.avgTempF}°F")
    }
}