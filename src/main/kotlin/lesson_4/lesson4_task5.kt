package org.example.lesson_4

fun main() {
    val damaged = true
    val crew = 70
    val provisionAmount = 51
    val favorableWeather = true

    val conditionsMet =
        !damaged && (crew in 55..70) && (provisionAmount > 50) || crew == 70 && favorableWeather && provisionAmount >= 50

    println("Корабль может выйти в плавание: $conditionsMet")
}