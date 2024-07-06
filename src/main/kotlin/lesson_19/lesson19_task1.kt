package org.example.lesson_19

fun main() {
    println("Вы можете добавить следующих рыб: ${Fish.entries.joinToString(", ")}")
}

enum class Fish(private val representation: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок");

    override fun toString(): String {
        return representation
    }
}