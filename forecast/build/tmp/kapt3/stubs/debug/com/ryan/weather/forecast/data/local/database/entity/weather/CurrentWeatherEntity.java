package com.ryan.weather.forecast.data.local.database.entity.weather;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00bd\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\f\u00a2\u0006\u0002\u0010\u001eJ\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u000fH\u00c6\u0003J\t\u0010<\u001a\u00020\u0011H\u00c6\u0003J\t\u0010=\u001a\u00020\fH\u00c6\u0003J\t\u0010>\u001a\u00020\fH\u00c6\u0003J\t\u0010?\u001a\u00020\u000fH\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\fH\u00c6\u0003J\t\u0010B\u001a\u00020\fH\u00c6\u0003J\t\u0010C\u001a\u00020\fH\u00c6\u0003J\t\u0010D\u001a\u00020\fH\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u000fH\u00c6\u0003J\t\u0010G\u001a\u00020\u000fH\u00c6\u0003J\t\u0010H\u001a\u00020\fH\u00c6\u0003J\t\u0010I\u001a\u00020\fH\u00c6\u0003J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0007H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0007H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\fH\u00c6\u0003J\t\u0010P\u001a\u00020\fH\u00c6\u0003J\u00ef\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\f2\b\b\u0002\u0010\u001d\u001a\u00020\fH\u00c6\u0001J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010U\u001a\u00020\u000fH\u00d6\u0001J\t\u0010V\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u001b\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\u001c\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u001d\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\'R\u0011\u0010\u001a\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\"R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\"R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0011\u0010\t\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0011\u0010\u0019\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\'R\u0011\u0010\u0018\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\'R\u0011\u0010\u0017\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\'R\u0011\u0010\u0016\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\'R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010 R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\'R\u0011\u0010\r\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\'R\u0011\u0010\u0014\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010 R\u0011\u0010\u0013\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\'R\u0011\u0010\u0012\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\'\u00a8\u0006W"}, d2 = {"Lcom/ryan/weather/forecast/data/local/database/entity/weather/CurrentWeatherEntity;", "", "city", "", "region", "country", "localtimeEpoch", "", "localtime", "lastUpdatedEpoch", "lastUpdated", "tempC", "", "tempF", "isDay", "", "condition", "Lcom/ryan/weather/forecast/data/local/database/entity/weather/ConditionEntity;", "windMph", "windKph", "windDegree", "windDir", "pressureMb", "pressureIn", "precipitationMm", "precipitationIn", "humidity", "cloud", "feelsLikeC", "feelsLikeF", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JLjava/lang/String;DDILcom/ryan/weather/forecast/data/local/database/entity/weather/ConditionEntity;DDILjava/lang/String;DDDDIIDD)V", "getCity", "()Ljava/lang/String;", "getCloud", "()I", "getCondition", "()Lcom/ryan/weather/forecast/data/local/database/entity/weather/ConditionEntity;", "getCountry", "getFeelsLikeC", "()D", "getFeelsLikeF", "getHumidity", "getLastUpdated", "getLastUpdatedEpoch", "()J", "getLocaltime", "getLocaltimeEpoch", "getPrecipitationIn", "getPrecipitationMm", "getPressureIn", "getPressureMb", "getRegion", "getTempC", "getTempF", "getWindDegree", "getWindDir", "getWindKph", "getWindMph", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "forecast_debug"})
@androidx.room.Entity(tableName = "weather")
public final class CurrentWeatherEntity {
    @androidx.room.PrimaryKey
    @org.jetbrains.annotations.NotNull
    private final java.lang.String city = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String region = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String country = null;
    private final long localtimeEpoch = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String localtime = null;
    private final long lastUpdatedEpoch = 0L;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lastUpdated = null;
    private final double tempC = 0.0;
    private final double tempF = 0.0;
    private final int isDay = 0;
    @androidx.room.Embedded
    @org.jetbrains.annotations.NotNull
    private final com.ryan.weather.forecast.data.local.database.entity.weather.ConditionEntity condition = null;
    private final double windMph = 0.0;
    private final double windKph = 0.0;
    private final int windDegree = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String windDir = null;
    private final double pressureMb = 0.0;
    private final double pressureIn = 0.0;
    private final double precipitationMm = 0.0;
    private final double precipitationIn = 0.0;
    private final int humidity = 0;
    private final int cloud = 0;
    private final double feelsLikeC = 0.0;
    private final double feelsLikeF = 0.0;
    
    public CurrentWeatherEntity(@org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    java.lang.String region, @org.jetbrains.annotations.NotNull
    java.lang.String country, long localtimeEpoch, @org.jetbrains.annotations.NotNull
    java.lang.String localtime, long lastUpdatedEpoch, @org.jetbrains.annotations.NotNull
    java.lang.String lastUpdated, double tempC, double tempF, int isDay, @org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.ConditionEntity condition, double windMph, double windKph, int windDegree, @org.jetbrains.annotations.NotNull
    java.lang.String windDir, double pressureMb, double pressureIn, double precipitationMm, double precipitationIn, int humidity, int cloud, double feelsLikeC, double feelsLikeF) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRegion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCountry() {
        return null;
    }
    
    public final long getLocaltimeEpoch() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLocaltime() {
        return null;
    }
    
    public final long getLastUpdatedEpoch() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLastUpdated() {
        return null;
    }
    
    public final double getTempC() {
        return 0.0;
    }
    
    public final double getTempF() {
        return 0.0;
    }
    
    public final int isDay() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.local.database.entity.weather.ConditionEntity getCondition() {
        return null;
    }
    
    public final double getWindMph() {
        return 0.0;
    }
    
    public final double getWindKph() {
        return 0.0;
    }
    
    public final int getWindDegree() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWindDir() {
        return null;
    }
    
    public final double getPressureMb() {
        return 0.0;
    }
    
    public final double getPressureIn() {
        return 0.0;
    }
    
    public final double getPrecipitationMm() {
        return 0.0;
    }
    
    public final double getPrecipitationIn() {
        return 0.0;
    }
    
    public final int getHumidity() {
        return 0;
    }
    
    public final int getCloud() {
        return 0;
    }
    
    public final double getFeelsLikeC() {
        return 0.0;
    }
    
    public final double getFeelsLikeF() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.local.database.entity.weather.ConditionEntity component11() {
        return null;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final int component14() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    public final double component16() {
        return 0.0;
    }
    
    public final double component17() {
        return 0.0;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component20() {
        return 0;
    }
    
    public final int component21() {
        return 0;
    }
    
    public final double component22() {
        return 0.0;
    }
    
    public final double component23() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    public final long component6() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.ryan.weather.forecast.data.local.database.entity.weather.CurrentWeatherEntity copy(@org.jetbrains.annotations.NotNull
    java.lang.String city, @org.jetbrains.annotations.NotNull
    java.lang.String region, @org.jetbrains.annotations.NotNull
    java.lang.String country, long localtimeEpoch, @org.jetbrains.annotations.NotNull
    java.lang.String localtime, long lastUpdatedEpoch, @org.jetbrains.annotations.NotNull
    java.lang.String lastUpdated, double tempC, double tempF, int isDay, @org.jetbrains.annotations.NotNull
    com.ryan.weather.forecast.data.local.database.entity.weather.ConditionEntity condition, double windMph, double windKph, int windDegree, @org.jetbrains.annotations.NotNull
    java.lang.String windDir, double pressureMb, double pressureIn, double precipitationMm, double precipitationIn, int humidity, int cloud, double feelsLikeC, double feelsLikeF) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}