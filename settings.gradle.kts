enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }

    val quarkusPluginVersion: String by settings
    val quarkusPluginId: String by settings
    plugins {
        id(quarkusPluginId) version quarkusPluginVersion
    }
}
rootProject.name = "quarkus-gradle"

include(":app")
include(":lib")

includeBuild("gradle/build-logic")
