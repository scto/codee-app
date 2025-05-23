plugins {
    id(Plugin.ANDROID_LIBRARY)
    id(Plugin.KOTLIN_ANDROID)
}

android {
    compileSdk = 34

    defaultConfig {
        minSdk = 21
        targetSdk = 34
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
    implementation(scriptingDependencies)
    implementation(scriptUtil)
    implementation(scriptRuntime)
    implementation(scriptingCompilerEmbeddable)
    implementation(pluginsAPI)
    implementation(ktScriptingMavenDependencies)
    implementation(compilerJvmHost)
    implementation(`app-core`)
}