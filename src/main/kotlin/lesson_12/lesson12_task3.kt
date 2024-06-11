package org.example.lesson_12

import kotlin.math.roundToInt

const val KelvinCoefficient = 273.15

fun main() {
    val day = DayWeather2(275, 273, false)

    day.print()
}

class DayWeather2(_dayTemperature: Int, _nightTemperature: Int, _wasPrecipitation: Boolean) {
    var dayTemperature = (_dayTemperature - KelvinCoefficient).roundToInt()
    var nightTemperature = (_nightTemperature - KelvinCoefficient).roundToInt()
    var wasPrecipitation = _wasPrecipitation

    fun print() {
        val rainyLiteral = if (wasPrecipitation) "Да" else "Нет"
        println("Дневная температура: $dayTemperature, ночная температура: $nightTemperature, были осадки: $rainyLiteral")
    }
}