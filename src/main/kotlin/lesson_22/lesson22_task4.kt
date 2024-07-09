package org.example.lesson_22

class MainScreenViewModel {
    private var state: MainScreenState = MainScreenState()

    fun loadData() {
        state = state.copy(isLoading = true)
        state = state.copy(data = "data")
    }
}

data class MainScreenState(private val data: String = "", private val isLoading: Boolean = false)
