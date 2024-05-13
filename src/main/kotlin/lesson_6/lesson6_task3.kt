package org.example.lesson_6

const val MILLISECONDS_AMOUNT = 1000

fun main() {
    println("Введите количество секунд")
    var seconds = readln().toInt()

    while (seconds > 0) {
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(MILLISECONDS_AMOUNT.toLong())
    }
    println("Время вышло")
}