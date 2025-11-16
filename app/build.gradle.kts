plugins {
    id("io.quarkus")

    id("dev.usadamasa.quarkus-conventions")
}

group = "dev.usadamasa"
version = "1.0.0-SNAPSHOT"

dependencies {
    implementation("io.quarkus:quarkus-rest")
    implementation("io.quarkus:quarkus-rest-jackson")
    implementation("io.quarkus:quarkus-arc")

    implementation(projects.lib)
}
