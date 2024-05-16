package org.example.lesson_7

fun main() {
    println("Введите правую границу прогрессии")
    val progressionLimit = readln().toInt()
    val range = if (progressionLimit > 0) 0..progressionLimit step 2 else 0 downTo progressionLimit step 2

    for (i in range) {
        println(i)
    }
}