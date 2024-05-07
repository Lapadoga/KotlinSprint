package org.example.lesson_3

fun main() {
    val stepData = "D2-D4;0"

    val dataParts = stepData.split(';')
    val pathParts = dataParts[0].split('-')

    val step = dataParts[1].toByte()
    val cellStart = pathParts[0]
    val cellEnd = pathParts[1]

    println("Номер шага: $step")
    println("Начальная ячейка: $cellStart")
    println("Конечная ячейка: $cellEnd")
}