package org.example.lesson_3

fun main() {
    var step = 1
    var cellStart = "E2"
    var cellEnd = "E4"

    println("[$cellStart-$cellEnd;$step]")

    step++
    val figureStep = 1
    val verticalStart = 2
    cellStart = "D$verticalStart"
    cellEnd = "D${verticalStart + figureStep}"

    println("[$cellStart-$cellEnd;$step]")
}