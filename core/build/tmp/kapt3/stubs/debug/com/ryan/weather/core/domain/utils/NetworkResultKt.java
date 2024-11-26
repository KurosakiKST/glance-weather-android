package com.ryan.weather.core.domain.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a<\u0010\u0000\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001j\b\u0012\u0004\u0012\u0002H\u0003`\u0004\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0006*\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00030\u0001\u001aR\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0006\"\u0004\b\u0002\u0010\b*\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\b0\tH\u0086\b\u00f8\u0001\u0000\u001aL\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0006*\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00020\tH\u0086\b\u00f8\u0001\u0000\u001aL\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0005\"\b\b\u0001\u0010\u0003*\u00020\u0006*\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00030\u00012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u00020\u00020\tH\u0086\b\u00f8\u0001\u0000*\n\u0010\r\"\u00020\u00062\u00020\u0006*(\u0010\u000e\u001a\u0004\b\u0000\u0010\u0003\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000f"}, d2 = {"asEmptyDataResult", "Lcom/ryan/weather/core/domain/utils/NetworkResult;", "", "E", "Lcom/ryan/weather/core/domain/utils/EmptyResult;", "T", "Lcom/ryan/weather/core/domain/utils/Error;", "map", "R", "Lkotlin/Function1;", "onError", "action", "onSuccess", "DomainError", "EmptyResult", "core_debug"})
public final class NetworkResultKt {
    
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Object, E extends com.ryan.weather.core.domain.utils.Error, R extends java.lang.Object>com.ryan.weather.core.domain.utils.NetworkResult<R, E> map(@org.jetbrains.annotations.NotNull
    com.ryan.weather.core.domain.utils.NetworkResult<? extends T, ? extends E> $this$map, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, ? extends R> map) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Object, E extends com.ryan.weather.core.domain.utils.Error>com.ryan.weather.core.domain.utils.NetworkResult<kotlin.Unit, E> asEmptyDataResult(@org.jetbrains.annotations.NotNull
    com.ryan.weather.core.domain.utils.NetworkResult<? extends T, ? extends E> $this$asEmptyDataResult) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Object, E extends com.ryan.weather.core.domain.utils.Error>com.ryan.weather.core.domain.utils.NetworkResult<T, E> onSuccess(@org.jetbrains.annotations.NotNull
    com.ryan.weather.core.domain.utils.NetworkResult<? extends T, ? extends E> $this$onSuccess, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> action) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final <T extends java.lang.Object, E extends com.ryan.weather.core.domain.utils.Error>com.ryan.weather.core.domain.utils.NetworkResult<T, E> onError(@org.jetbrains.annotations.NotNull
    com.ryan.weather.core.domain.utils.NetworkResult<? extends T, ? extends E> $this$onError, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super E, kotlin.Unit> action) {
        return null;
    }
}