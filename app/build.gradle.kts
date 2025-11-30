plugins {
	// Apply the shared build logic from a convention plugin.
	// The shared code is located in `buildSrc/src/main/kotlin/kotlin-jvm.gradle.kts`.
	id("buildsrc.convention.kotlin-jvm")
	
	// Apply the Application plugin to add support for building an executable JVM application.
	application
}

dependencies {
	// Project "app" depends on project "utils". (Project paths are separated with ":", so ":utils" refers to the top-level "utils" project.)
	implementation(project(":utils"))
	implementation(kotlin("reflect"))
	
	// For tests in src/main/kotlin
	implementation(kotlin("test"))
	
	// Logging
	implementation("io.github.microutils:kotlin-logging:1.4.6")
	implementation("org.slf4j:slf4j-simple:1.7.25")

	// Последние две зависисмости (ниже) относятся к библиотеке "Arrow" (сайт arrow-kt.io)
	implementation("io.arrow-kt:arrow-core:2.2.0")
	implementation("io.arrow-kt:arrow-fx-coroutines:2.2.0")
}

application {
	// Define the Fully Qualified Name for the application main class
	// (Note that Kotlin compiles `App.kt` to a class with FQN `com.example.app.AppKt`.)
	mainClass = "org.example.app.AppKt"
}
