package org.example.lesson_3

fun main() {
    var age: Byte = 20
    val name = "Татьяна"
    var surname = "Андреева"
    val patronymic = "Сергеевна"

    println("$surname $name $patronymic, $age")

    age = 22
    surname = "Сидорова"

    println("$surname $name $patronymic, $age")
}