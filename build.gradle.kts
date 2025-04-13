import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
import org.jetbrains.kotlin.gradle.dsl.jvm.JvmTargetValidationMode
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(androidBuildTools)
        classpath(kotlinGradlePlugin)
    }
}

tasks.withType<KotlinCompile>().configureEach {
    compilerOptions {
      apiVersion = KotlinVersion.KOTLIN_2_0
      languageVersion = KotlinVersion.KOTLIN_2_0
      jvmTarget = JvmTarget.JVM_17
      jvmTargetValidationMode = JvmTargetValidationMode.WARNING
      freeCompilerArgs.add("-Xjvm-default=all")
    }
}
  
tasks.register<Delete>("clean") { delete(rootProject.layout.buildDirectory) }

/*
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
*/