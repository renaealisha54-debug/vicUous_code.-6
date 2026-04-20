plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.vicious.code"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.vicious.code"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}

dependencies {
    // Paste your existing dependencies here!
    // Example: implementation("androidx.core:core-ktx:1.12.0")
}
