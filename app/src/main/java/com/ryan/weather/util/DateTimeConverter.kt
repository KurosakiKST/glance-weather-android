package com.ryan.weather.util

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object DateTimeConverter {
    fun convertDateTime(inputDateTime: String): String {
        val inputFormat = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
        val outputFormat = SimpleDateFormat("dd MMMM, yyyy HH:mm aa", Locale.getDefault())

        val date: Date = inputFormat.parse(inputDateTime) ?: return ""
        return outputFormat.format(date)
    }
}