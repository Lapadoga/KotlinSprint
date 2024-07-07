package org.example.lesson_20

fun main() {
    val healPlayer: (Player, Int) -> Unit = { player: Player, amount: Int -> player.heal(amount) }

    val player = Player(name = "Alex", currentHealth = 50)
    println(player)

    healPlayer(player, 50)
    println(player)
}

class Player(val name: String, private val maxHealth: Int = 100, private var currentHealth: Int = 100) {
    fun heal(amount: Int) {
        currentHealth += amount
    }

    override fun toString(): String {
        return "Имя игрока: $name, текущее здоровье: $currentHealth, максимальное здоровье: $maxHealth}"
    }
}