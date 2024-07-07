package org.example.lesson_21

fun main() {
    println("Введите проверямемую строку")
    val string = readln()
    println(string.vowelCount())
}

fun String.vowelCount(): Int {
    val englishVowels = listOf('a', 'e', 'i', 'o', 'u', 'y')
    val russianVowels = listOf('а', 'у', 'о', 'и', 'э', 'ы', 'я', 'ю', 'е', 'ё')

    var counter = 0
    forEachIndexed { _, c ->
        if (englishVowels.contains(c.lowercaseChar()) || russianVowels.contains(c.lowercaseChar()))
            counter++
    }
    return counter
}