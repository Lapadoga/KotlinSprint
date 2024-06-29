package org.example.lesson_16

fun main() {
    val player = Player("Test", 100, 5)

    player.takeDamage(50)
    player.heal(25)
    player.takeDamage(80)
    player.heal(50)
}

class Player(
    private val name: String,
    private var health: Int,
    private var strength: Int,
) {
    private var canBeHealed = true

    fun takeDamage(value: Int) {
        if (value >= 0) {
            health -= value
            println("Вы получили урон, текущее здоровье: $health")
        }
        if (health <= 0) {
            death()
            println("Вы мертвы")
        }
    }

    private fun death() {
        health = 0
        strength = 0
        canBeHealed = false
    }

    fun heal(value: Int) {
        if (value >= 0)
            if (canBeHealed) {
                health += value
                println("Лечение... Текущее здоровье: $health")
            } else
                println("Вы не можете лечиться")
    }
}