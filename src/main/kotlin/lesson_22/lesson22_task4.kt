package org.example.lesson_22

fun main() {
    val state1 = MainScreenState()
    println(state1)

    val state2 = state1.copy(isLoading = true)
    println(state2)

    val state3 = state1.copy(data = "data")
    println(state3)
}

data class MainScreenState(val data: String = "", val isLoading: Boolean = false)