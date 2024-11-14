package com.ryan.weather.weather.presentation.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ryan.weather.core.presentation.components.TextBody1
import com.ryan.weather.core.presentation.components.TextH6


@Composable
fun WeatherItem(key: String, value: String) {
    Column(
        modifier = Modifier.padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextH6(
            text = value,
        )
        TextBody1(
            text = key,
            fontWeight = FontWeight.Medium,
            color = Color.Gray
        )
    }
}