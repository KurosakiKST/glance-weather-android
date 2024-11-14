package com.ryan.weather.core.domain.utils

enum class NetworkError: Error {
    REQUEST_TIMEOUT,
    TOO_MANY_REQUESTS,
    NO_INTERNET,
    SERVER_ERROR,
    SERIALIZATION,
    UNKNOWN,
    NO_CACHED_DATA
}