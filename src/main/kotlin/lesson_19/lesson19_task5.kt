package org.example.lesson_19

fun main() {
    println(
        """
        Введите данные о пяти людях в формате:
        [Имя] [Пол]
        Доступные значения полов: М, Ж
    """.trimIndent()
    )

    val card = CardIndex()
    var counter = 1
    while (counter <= 5) {
        val enteredString = readln()
        val values = enteredString.split(" ")
        if (values.size != 2) {
            println("Неверный формат ввода, повторите попытку")
            continue
        }

        val name = values[0]
        val genderLit = values[1]
        card.addUser(name, genderLit)
        counter++
    }
    println(card)
}

enum class Gender(val literal: String) {
    MALE("М"),
    FEMALE("Ж"),
    UNDEFINED("0");

    override fun toString(): String {
        return when (name) {
            "MALE" -> "Мужской"
            "FEMALE" -> "Женский"
            else -> "Неопределено"
        }
    }
}

class User(private val name: String, private val gender: Gender) {
    override fun toString(): String {
        return "Имя: $name, пол: $gender"
    }
}

class CardIndex {
    private val listOfUsers: MutableList<User> = mutableListOf()

    fun addUser(name: String, gender: Gender) {
        listOfUsers.add(User(name, gender))
    }

    fun addUser(user: User) {
        listOfUsers.add(user)
    }

    fun addUser(name: String, gender: String) {
        val userGender = when (gender) {
            Gender.MALE.literal -> Gender.MALE
            Gender.FEMALE.literal -> Gender.FEMALE
            else -> Gender.UNDEFINED
        }
        listOfUsers.add(User(name, userGender))
    }

    override fun toString(): String {
        var string = "Список пользователей:\n"
        listOfUsers.forEach {
            string += "$it\n"
        }
        return string
    }
}