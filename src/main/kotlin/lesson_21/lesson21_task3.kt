package org.example.lesson_21

class Player(val name: String, val maxHealth: Int = 100, var currentHealth: Int = 100) {
    fun heal(amount: Int) {
        currentHealth += amount
    }

    override fun toString(): String {
        return "Имя игрока: $name, текущее здоровье: $currentHealth, максимальное здоровье: $maxHealth}"
    }
}

fun Player.isHealthy(): Boolean {
    return maxHealth == currentHealth
}