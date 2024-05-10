package org.example.lesson_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    val firstWeight = 20
    val firstVolume = 80
    val secondWeight = 50
    val secondVolume = 100

    println("Груз с весом $firstWeight кг и объемом $firstVolume соответствует категории 'Average': ${(firstWeight >= MIN_WEIGHT) && (firstWeight <= MAX_WEIGHT) && (firstVolume < MAX_VOLUME)}")
    println("Груз с весом $secondWeight кг и объемом $secondVolume соответствует категории 'Average': ${(secondWeight >= MIN_WEIGHT) && (secondWeight <= MAX_WEIGHT) && (secondVolume < MAX_VOLUME)}")
}