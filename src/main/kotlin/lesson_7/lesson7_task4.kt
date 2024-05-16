package org.example.lesson_7

const val PAUSE_TIME = 1000L

fun main() {
    println("Введите количество секнуд")
    val amountOfSeconds = readln().toInt()

    for (i in amountOfSeconds downTo 1) {
        println("Количество оставшихся секунд: $i")
        Thread.sleep(PAUSE_TIME)
    }
    println("Время вышло")
}