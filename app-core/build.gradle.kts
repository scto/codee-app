plugins {
    id(Plugin.ANDROID_LIBRARY)
    id(Plugin.KOTLIN_ANDROID)
}

android {
    namespace = "${ApplicationConfig.PACKAGE}.app-core"
    compileSdk = ApplicationConfig.TARGET_SDK_VERSION

    defaultConfig {
        minSdk = ApplicationConfig.MIN_SDK_VERSION
        targetSdk = ApplicationConfig.TARGET_SDK_VERSION

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    /*
    kotlinOptions {
        jvmTarget = "1.8"
    }
    */
}

dependencies {
    implementation(androidKtCore)
    implementation(appCompat)
    implementation(material)
    implementation(composeUI)
    implementation(composeMaterial)
    implementation(resources)
    implementation(pluginsAPI)
}