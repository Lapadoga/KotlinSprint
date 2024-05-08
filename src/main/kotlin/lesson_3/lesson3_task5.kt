package org.example.lesson_3

fun main() {
    val stepData = "D2-D4;0"

    val dataParts = stepData.split(';', '-')

    val cellStart = dataParts[0]
    val cellEnd = dataParts[1]
    val step = dataParts[2].toByte()

    println("Номер шага: $step")
    println("Начальная ячейка: $cellStart")
    println("Конечная ячейка: $cellEnd")
}