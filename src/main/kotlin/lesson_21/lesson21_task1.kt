package org.example.lesson_21

fun main() {
    println("Введите проверямемую строку")
    val string = readln()
    println(string.vowelCount())
}

fun String.vowelCount(): Int {
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'y', 'а', 'у', 'о', 'и', 'э', 'ы', 'я', 'ю', 'е', 'ё')

    return count { it.lowercaseChar() in vowels }
}