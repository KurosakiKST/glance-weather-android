package com.ryan.weather.home.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.ryan.weather.core.presentation.components.TextBody1
import com.ryan.weather.core.presentation.components.TextBody2
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
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color(0xFF081E56),
                shape = RoundedCornerShape(16.dp)
            )
            .padding(8.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextBody1(
            text = forecastDay.date,
            modifier = Modifier.weight(1f),
            fontWeight = FontWeight.Bold
        )
        Row(
            modifier = Modifier.weight(1f),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextBody2(
                text = "${forecastDay.day.avgTempF}°F",
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.width(8.dp))
            AsyncImage(
                modifier = Modifier.size(60.dp),
                model = "https:${forecastDay.day.condition.icon}".replace(
                    "64x64",
                    "128x128"
                ),
                contentDescription = "Condition",
            )
        }
    }
}

