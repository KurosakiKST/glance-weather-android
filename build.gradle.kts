buildscript {
    dependencies {
        classpath("com.google.firebase:firebase-appdistribution-gradle:4.0.1")
        classpath("com.google.gms:google-services:4.4.1")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.hilt.plugin) apply false
}