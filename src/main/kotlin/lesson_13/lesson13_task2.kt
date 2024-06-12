package org.example.lesson_13

fun main() {
    val user = UserCredits1("Alex", 123)

    user.print()
}

class UserCredits1(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun print() {
        println("Имя: $name, номер: $phoneNumber, компания: ${company ?: "<не указано>"}")
    }
}