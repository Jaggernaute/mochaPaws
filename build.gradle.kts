import com.diffplug.gradle.spotless.SpotlessTask

plugins {
    id("java")
    id("com.diffplug.spotless") version "6.20.0"
}

group = "com.jaggernaute"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

tasks.register("spotless", SpotlessTask::class)

