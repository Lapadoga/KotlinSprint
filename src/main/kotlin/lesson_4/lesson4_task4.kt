package org.example.lesson_4

fun main() {
    val parity = 2
    val dayOfTraining = 7

    val conditionForUpperBody = dayOfTraining % parity == 1
    val conditionForLowerBody = dayOfTraining % parity == 0

    println(
        """
        Упражнения для рук:    $conditionForUpperBody
        Упражнения для ног:    $conditionForLowerBody
        Упражнения для спины:  $conditionForLowerBody
        Упражнения для пресса: $conditionForUpperBody
    """.trimIndent()
    )
}