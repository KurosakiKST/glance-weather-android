package com.ryan.weather.core.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable

import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun TextH5(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = Color.White
) {
    Text(
        modifier = modifier,
        text = text,
        fontSize = 30.sp,
        lineHeight = 36.sp,
        fontWeight = FontWeight.Bold,
        style = MaterialTheme.typography.headlineSmall,
        color = color,
        textAlign = TextAlign.Center
    )
}

@Composable
fun TextH2(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = Color.White
) {
    Text(
        modifier = modifier,
        text = text,
        fontSize = 64.sp,
        lineHeight = 68.sp,
        fontWeight = FontWeight.Bold,
        style = MaterialTheme.typography.headlineLarge,
        color = color,
        textAlign = TextAlign.Center
    )
}

@Composable
fun TextH6(
    modifier: Modifier = Modifier,
    text: String,
    color: Color = Color.White
) {
    Text(
        modifier = modifier,
        text = text,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontWeight = FontWeight.Bold,
        style = MaterialTheme.typography.headlineSmall,
        color = color,
        textAlign = TextAlign.Center
    )
}

@Composable
fun TextBody1(
    modifier: Modifier = Modifier,
    text: String,
    fontWeight: FontWeight = FontWeight.Normal,
    color: Color = Color.White
) {
    Text(
        modifier = modifier,
        text = text,
        fontSize = 18.sp,
        lineHeight = 26.sp,
        style = MaterialTheme.typography.bodyLarge,
        fontWeight = fontWeight,
        color = color,
        textAlign = TextAlign.Center
    )
}

@Composable
fun TextBody2(
    modifier: Modifier = Modifier,
    text: String,
    fontWeight: FontWeight = FontWeight.Normal,
    color: Color = Color.White
) {
    Text(
        modifier = modifier,
        text = text,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        style = MaterialTheme.typography.bodyMedium,
        fontWeight = fontWeight,
        color = color,
        textAlign = TextAlign.Center
    )
}

@Composable
fun TextCaption1(
    modifier: Modifier = Modifier,
    text: String,
    fontWeight: FontWeight = FontWeight.Normal,
    color: Color = Color.White
) {
    Text(
        modifier = modifier,
        text = text,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        style = MaterialTheme.typography.bodySmall,
        fontWeight = fontWeight,
        color = color,
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true, backgroundColor = 0xFF000000)
@Composable
fun TextPreview() {
    Column {
        TextH2(text = "Heading H2")
        TextH5(text = "Heading H5")
        TextH6(text = "Heading H6")
        TextBody1(text = "Body 1")
        TextBody2(text = "Body 2")
        TextCaption1(text = "Caption 1")
    }
}