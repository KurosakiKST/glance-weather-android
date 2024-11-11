package com.ryan.weather.home.data.mappers

import java.text.ParseException
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

    fun convertDay(dateString: String): String {
        return try {
            val inputFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            val date = inputFormat.parse(dateString)
            val outputFormat = SimpleDateFormat("EEE", Locale.getDefault())
            val dayOfWeek = outputFormat.format(date!!)

            val today = inputFormat.format(Date())
            if (dateString == today) {
                "Today"
            } else {
                dayOfWeek
            }
        } catch (e: ParseException) {
            "Invalid Date"
        }
    }
}