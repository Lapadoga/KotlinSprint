package org.example.lesson_13

fun main() {
    val userList = listOf(
        UserCredits2("Alex", 123, null),
        UserCredits2("Jack", 345, null),
        UserCredits2("Mike", 678, "null"),
        UserCredits2("Алексей", 10234, "Яндекс"),
        UserCredits2("Артем", 432231, "Яндекс")
    )

    val companySet = mutableSetOf<String>()
    userList.forEach {
        if (it.company != null)
            companySet.add(it.company)
    }

    companySet.forEach {
        println(it)
    }
}

class UserCredits2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun print() {
        println("Имя: $name, номер: $phoneNumber, компания: ${company ?: "<не указано>"}")
    }
}