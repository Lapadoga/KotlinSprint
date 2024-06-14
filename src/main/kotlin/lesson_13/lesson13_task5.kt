package org.example.lesson_13

fun main() {
    println("Введите имя контакта")
    val name = readln()

    println("Введите компанию контакта")
    var company: String? = readln()
    if (company == "")
        company = null

    println("Введите номер контакта")
    try {
        val number = readln().toLong()

        val user = UserCredits4(name, number, company)
        user.print()
    } catch (e: NumberFormatException) {
        println(e::class.simpleName)
    }
}

class UserCredits4(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun print() {
        println("Имя: $name, номер: $phoneNumber, компания: ${company ?: "<не указано>"}")
    }
}