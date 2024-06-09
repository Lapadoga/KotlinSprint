package org.example.lesson_12

import kotlin.math.roundToInt

const val KelvinCoefficient = 273.15

fun main() {
    val day = DayWeather3(278, 274, true)
}

class DayWeather3(_dayTemperature: Int, _nightTemperature: Int, _wasPrecipitation: Boolean) {
    var dayTemperature = (_dayTemperature - KelvinCoefficient).roundToInt()
    var nightTemperature = (_nightTemperature - KelvinCoefficient).roundToInt()
    var wasPrecipitation = _wasPrecipitation

    init {
        println("Дневная температура: $dayTemperature, ночная температура: $nightTemperature, были осадки: $wasPrecipitation")
    }
}