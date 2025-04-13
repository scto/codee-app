plugins {
  alias(Plugin.ANDROID_APPLICATION) apply false
  alias(Plugin.ANDROID_LIBRARY) apply false
  alias(Plugins.KOTLIN_ANDROID) apply false
  alias(Plugin.KOTLIN) apply false
  alias(Plugin.JAVA_LIBRARY) apply false
  alias(Plugin.JVM) apply false
}

/*
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    /*
    dependencies {
        classpath(androidBuildTools)
        classpath(kotlinGradlePlugin)
    }
    */
}

tasks.register<Delete>("clean") { delete(rootProject.layout.buildDirectory) }

/*
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
*/