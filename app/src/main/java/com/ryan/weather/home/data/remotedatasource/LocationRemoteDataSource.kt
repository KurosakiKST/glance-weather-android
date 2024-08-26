package com.ryan.weather.home.data.remotedatasource

import android.util.Log
import com.google.gson.Gson
import com.ryan.weather.core.data.RequestErrorHandler
import com.ryan.weather.core.services.LocationAPIService
import com.ryan.weather.home.data.datasource.LocationDataSource
import com.ryan.weather.home.data.responsemapper.toDomainModel
import com.ryan.weather.home.data.responsemodel.ErrorModel
import com.ryan.weather.home.data.responsemodel.ErrorResponseModel
import com.ryan.weather.home.domain.model.CityDomainModel
import com.ryan.weather.util.WResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LocationRemoteDataSource @Inject constructor(
    private val locationAPIService: LocationAPIService
) : LocationDataSource {
    override suspend fun getCities(
        apiKey: String,
        city: String
    ): WResult<List<CityDomainModel>> {
        return withContext(Dispatchers.IO) {
            try {
                val response = locationAPIService.getCities(apiKey, city)
                if (response.isSuccessful) {
                    val weatherResult = response.body()?.map {
                        it.toDomainModel()
                    }
                    if (weatherResult != null) {
                        WResult.Success(weatherResult)
                    } else {
                        WResult.Failure(
                            RequestErrorHandler.getApiError(
                                ErrorResponseModel(
                                    ErrorModel(-1, "Invalid data")
                                )
                            )
                        )
                    }
                } else {
                    val errorBody = response.errorBody()?.string()
                    val errorResponse = Gson().fromJson(errorBody, ErrorResponseModel::class.java)
                    WResult.Failure(RequestErrorHandler.getApiError(errorResponse))
                }
            } catch (e: Exception) {
                Log.e("LocationRemoteDataSource", "Network error", e)
                WResult.Failure(RequestErrorHandler.getRequestError(e))
            }
        }
    }
}