import org.gradle.jvm.tasks.Jar

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
    id ("com.github.johnrengelman.shadow") version "7.1.2"
}

group = "io.github.ruattd.mclv"
version = "1.0-SNAPSHOT"

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("com.guardsquare:proguard-gradle:7.2.0")
    }
}

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    jvm {
        jvmToolchain(17)
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)
                implementation("org.jetbrains.compose.material3:material3:1.4.0")
                implementation("moe.tlaster:precompose:1.4.2")
            }
        }
        val jvmTest by getting
    }
}

compose.desktop {
    application {
        mainClass = "io.github.ruattd.mclv.MainKt"
    }
}
