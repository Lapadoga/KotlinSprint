package org.example.lesson_12

import kotlin.random.Random

const val daysInMonth = 30

fun main() {

    val randomRangeInt = 1..30
    val dayTemperatureList = mutableListOf<Int>()
    val nightTemperatureList = mutableListOf<Int>()
    val rainyDaysList = mutableListOf<DayWeather4>()

    for (i in 1..daysInMonth) {
        val dayWeather = DayWeather4(randomRangeInt.random(), randomRangeInt.random(), Random.nextBoolean())

        if (dayWeather.wasPrecipitation)
            rainyDaysList.add(dayWeather)
        dayTemperatureList.add(dayWeather.dayTemperature)
        nightTemperatureList.add(dayWeather.nightTemperature)
    }

    println(
        """
        Средняя дневная температура: ${dayTemperatureList.average()}
        Средняя ночная температура: ${nightTemperatureList.average()}
        Дней с осадками: ${rainyDaysList.size}
    """.trimIndent()
    )
}

class DayWeather4(val dayTemperature: Int, val nightTemperature: Int, val wasPrecipitation: Boolean)