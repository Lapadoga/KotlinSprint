package org.example.lesson_19

fun main() {
    println("Вы можете добавить следующих рыб:")
    Fish.entries.forEach {
        println(it.getName())
    }
}

enum class Fish {
    GUPPY {
        override fun getName(): String {
            return "Гуппи"
        }
    },
    ANGELFISH {
        override fun getName(): String {
            return "Cкалярия"
        }
    },
    GOLDFISH {
        override fun getName(): String {
            return "Золотая рыбка"
        }
    },
    SIAMESE_FIGHTING_FISH {
        override fun getName(): String {
            return "Петушок"
        }
    };

    abstract fun getName(): String
}