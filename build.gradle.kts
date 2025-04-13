buildscript {
    dependencies {
        classpath(androidBuildTools)
        classpath(kotlinGradlePlugin)
    }
}

tasks.register<Delete>("clean") { delete(rootProject.layout.buildDirectory) }

/*
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
*/