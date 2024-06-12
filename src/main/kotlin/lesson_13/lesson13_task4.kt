package org.example.lesson_13

fun main() {
    val phonebook = mutableListOf<UserCredits3>()

    do {
        println(
            """
            1. Добавить запись в телефонную книгу
            0. Прекратить добавление
        """.trimIndent()
        )
        val userAnswer = readln().toInt()
        if (userAnswer != 1)
            continue

        println("Введите имя контакта")
        val name = readln()

        println("Введите компанию контакта")
        var company: String? = readln()
        if (company == "")
            company = null

        println("Введите номер контакта")
        val phoneNumber = readln().toLongOrNull()
        if (phoneNumber == null) {
            println("Номер не введён, запись не будет добавлена")
            continue
        }

        phonebook.add(UserCredits3(name, phoneNumber, company))
    } while (userAnswer == 1)

    phonebook.forEach {
        it.print()
    }
}

class UserCredits3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun print() {
        println("Имя: $name, номер: $phoneNumber, компания: ${company ?: "<не указано>"}")
    }
}