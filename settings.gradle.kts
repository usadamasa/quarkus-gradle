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
rootProject.name="quarkus-gradle"

include(":app")

includeBuild("gradle/build-logic")
