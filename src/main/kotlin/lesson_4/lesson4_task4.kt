package org.example.lesson_4

fun main() {
    val parity = 2
    val dayOfTraining = 6

    val isEven = dayOfTraining % parity == 0

    println(
        """
        Упражнения для рук:    ${!isEven}
        Упражнения для ног:    $isEven
        Упражнения для спины:  $isEven
        Упражнения для пресса: ${!isEven}
    """.trimIndent()
    )
}