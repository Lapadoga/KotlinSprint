package org.example.lesson_5

fun main() {
    val number1 = 23
    val number2 = 37

    println("Чтобы подтвердить, что вы человек, введите сумму чисел $number1 и $number2")

    val answer = readln().toInt()

    if (answer == number1 + number2)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}