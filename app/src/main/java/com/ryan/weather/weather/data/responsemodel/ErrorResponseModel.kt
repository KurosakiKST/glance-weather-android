package com.ryan.weather.weather.data.responsemodel

import com.google.gson.annotations.SerializedName

data class ErrorResponseModel(
    @SerializedName("error") val error: ErrorModel
)

data class ErrorModel(
    @SerializedName("code") val code: Int,
    @SerializedName("message") val message: String
)
