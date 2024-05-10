package org.example.lesson_4

const val MIN_CREW = 55
const val RECOMMENDED_CREW = 70
const val MIN_PROVISION = 50

fun main() {
    val isDamaged = true
    val isGoodWeather = true
    val crew = 70
    val provisionAmount = 51

    val conditionsMet =
        !isDamaged && (crew in MIN_CREW..RECOMMENDED_CREW) && (provisionAmount > MIN_PROVISION) ||
                crew == RECOMMENDED_CREW && isGoodWeather && provisionAmount >= MIN_PROVISION

    println("Корабль может выйти в плавание: $conditionsMet")
}