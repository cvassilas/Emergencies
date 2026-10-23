plugins { id("com.android.application") }

android {
    namespace = "com.cvassilas.emergencies"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.cvassilas.emergencies"
        minSdk = 29
        targetSdk = 34
        versionCode = (System.getenv("GITHUB_RUN_NUMBER") ?: "1").toInt()
        versionName = "1.0"
    }
    signingConfigs {
        create("release") {
            storeFile = file("release.jks")
            storePassword = "emergencies-release"
            keyAlias = "emergencies"
            keyPassword = "emergencies-release"
        }
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("release")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    implementation("androidx.webkit:webkit:1.11.0")
}
