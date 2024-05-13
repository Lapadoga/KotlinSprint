package org.example.lesson_6

const val CONVERTING_VALUE = 1000

fun main() {
    println("Введите количество секунд")
    val seconds = readln().toLong()

    Thread.sleep(seconds * CONVERTING_VALUE)

    println("Прошло $seconds секунд")
}