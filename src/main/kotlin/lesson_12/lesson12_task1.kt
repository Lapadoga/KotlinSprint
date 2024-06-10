package org.example.lesson_12

fun main() {
    val day1 = DayWeather()
    val day2 = DayWeather()

    day1.dayTemperature = 4
    day1.nightTemperature = -1
    day1.wasPrecipitation = false

    day2.dayTemperature = 5
    day2.nightTemperature = -4
    day2.wasPrecipitation = true

    day1.print()
    day2.print()
}

class DayWeather {
    var dayTemperature = 1
    var nightTemperature = -1
    var wasPrecipitation = true

    fun print() {
        val rainyLiteral = if (wasPrecipitation) "Да" else "Нет"
        println("Дневная температура: $dayTemperature, ночная температура: $nightTemperature, были осадки: $rainyLiteral")
    }
}