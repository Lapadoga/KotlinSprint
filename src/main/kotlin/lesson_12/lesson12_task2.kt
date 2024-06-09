package org.example.lesson_12

fun main() {
    val day = DayWeather1(5, 2, true)

    day.print()
}

class DayWeather1(_dayTemperature: Int, _nightTemperature: Int, _wasPrecipitation: Boolean) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var wasPrecipitation = _wasPrecipitation

    fun print() {
        println("Дневная температура: $dayTemperature, ночная температура: $nightTemperature, были осадки: $wasPrecipitation")
    }
}