package org.example.lesson_4

const val REQUIRED_AIR_HUMIDITY = 20
const val WINTER_STRING = "Зима"

fun main() {
    val sunnyWeather = true
    val isAwningOpen = true
    val airHumidity = 20
    val currentSeason = WINTER_STRING

    val conditionsMet =
        sunnyWeather && isAwningOpen && (airHumidity == REQUIRED_AIR_HUMIDITY) && (currentSeason != WINTER_STRING)

    println("Благоприятные ли условия сейчас для роста бобовых? $conditionsMet")
}