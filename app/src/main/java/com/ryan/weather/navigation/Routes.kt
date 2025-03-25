package com.ryan.weather.navigation

sealed class Routes(val route: String) {
    object Welcome : Routes("welcome")
    object Home : Routes("home")
    object Search : Routes("search")
    object MyCities : Routes("my_cities")
    object Detail : Routes("detail/{cityId}") {
        fun createRoute(cityId: String) = "detail/$cityId"
    }
}