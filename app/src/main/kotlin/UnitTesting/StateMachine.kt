/*
Чтобы работал import kotlin.test,
нужно добавить в файл build.gradle.kts:
dependencies {
	.......
	-------
	// For tests in src/main/kotlin
	implementation(kotlin("test"))
}
не забыв затем выполнить "Sync All Gradle Projects"
 */
package unittesting

import unittesting.State.*

enum class State { On, Off, Paused }

class StateMachine {
	var state: State = Off
		private set
	
	private fun transition(
		new: State, current: State = On
	) {
		if (new == Off && state != Off)
			state = Off
		else if (state == current)
			state = new
	}
	
	fun start() = transition(On, Off)
	fun pause() = transition(Paused, On)
	fun resume() = transition(On, Paused)
	fun finish() = transition(Off)
}
