package org.example.lesson_12

fun main() {
    val day = DayWeather1(5, 2, true)

    day.print()
}

class DayWeather1(var dayTemperature: Int, var nightTemperature: Int, var wasPrecipitation: Boolean) {

    fun print() {
        println("Дневная температура: $dayTemperature, ночная температура: $nightTemperature, были осадки: $wasPrecipitation")
    }
}