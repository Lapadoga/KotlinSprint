package org.example.lesson_21

import java.io.File

fun main() {
    val file = File("test.txt")

    do {
        var answer = -1
        println(
            """
            ---------------------------------------
            1. Ввести новое слово
            0. Выйти
        """.trimIndent()
        )
        try {
            answer = readln().toInt()
        } catch (e: NumberFormatException) {
            println("Введено неверное значение, попробуйте ещё раз")
        }
        if (answer != 1)
            continue

        println("Введите слово для добавления")
        val newLetter = readln()
        file.writeNewLetter(newLetter)
        println("Слово $newLetter добавлено в файл")
    } while (answer != 0)
}

fun File.writeNewLetter(letter: String) {
    val currentText = readText()
    writeText("${letter.lowercase()}\n")
    appendText(currentText)
}