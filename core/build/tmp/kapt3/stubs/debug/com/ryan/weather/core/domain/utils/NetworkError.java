package com.ryan.weather.core.domain.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2 = {"Lcom/ryan/weather/core/domain/utils/NetworkError;", "", "Lcom/ryan/weather/core/domain/utils/Error;", "(Ljava/lang/String;I)V", "REQUEST_TIMEOUT", "TOO_MANY_REQUESTS", "NO_INTERNET", "SERVER_ERROR", "SERIALIZATION", "UNKNOWN", "NO_CACHED_DATA", "core_debug"})
public enum NetworkError implements com.ryan.weather.core.domain.utils.Error {
    /*public static final*/ REQUEST_TIMEOUT /* = new REQUEST_TIMEOUT() */,
    /*public static final*/ TOO_MANY_REQUESTS /* = new TOO_MANY_REQUESTS() */,
    /*public static final*/ NO_INTERNET /* = new NO_INTERNET() */,
    /*public static final*/ SERVER_ERROR /* = new SERVER_ERROR() */,
    /*public static final*/ SERIALIZATION /* = new SERIALIZATION() */,
    /*public static final*/ UNKNOWN /* = new UNKNOWN() */,
    /*public static final*/ NO_CACHED_DATA /* = new NO_CACHED_DATA() */;
    
    NetworkError() {
    }
    
    @org.jetbrains.annotations.NotNull
    public static kotlin.enums.EnumEntries<com.ryan.weather.core.domain.utils.NetworkError> getEntries() {
        return null;
    }
}