plugins {
    kotlin("jvm") version "1.5.10"
    id("com.github.johnrengelman.shadow") version "7.0.0"
    id("com.github.gmazzo.buildconfig") version "3.0.0"
}

group = "me.maximilian1021"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/")
    maven("https://repo.codemc.io/repository/maven-snapshots/")

}


dependencies {
    // PaperMC Dependency
    compileOnly("com.destroystokyo.paper", "paper-api", "1.16.5-R0.1-SNAPSHOT")

    // KSpigot dependency
    implementation("net.axay", "kspigot", "1.16.29")
}

tasks {
    jar {
        enabled = false
    }
    build {
        dependsOn(shadowJar)
    }
    shadowJar {
        // Relocating KSpigot to prevent conflicts with multiple Plugins using KSpigot
        relocate("net.axay.kspigot", "${project.group}.${project.name.toLowerCase()}.shadow.net.axay.kspigot")
    }

    compileJava {
        options.release.set(16)
    }

    compileKotlin {
        kotlinOptions.jvmTarget = "16"
    }
}
