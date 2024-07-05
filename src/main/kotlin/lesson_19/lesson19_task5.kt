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
    for (i in 0..4) {
        val enteredString = readln()
        val values = enteredString.split(" ")
        val name = values[0]
        val genderLit = values[1]
        card.addUser(name, genderLit)
    }
    println(card)
}

enum class Gender(val literal: String) {
    MALE("М") {
        override fun getDescription(): String {
            return "Мужской"
        }
    },
    FEMALE("Ж") {
        override fun getDescription(): String {
            return "Женский"
        }
    },
    UNDEFINED("0") {
        override fun getDescription(): String {
            return "Неопределено"
        }
    };

    abstract fun getDescription(): String
}

class User(private val name: String, private val gender: Gender) {
    override fun toString(): String {
        return "Имя: $name, пол: ${gender.getDescription()}"
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