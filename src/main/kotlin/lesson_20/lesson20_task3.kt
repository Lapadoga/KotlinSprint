package org.example.lesson_20

fun main() {
    val openDoor: (Player) -> Unit = { if (it.checkKey()) println("Дверь открыта") else println("Дверь заперта") }

    val player = Player("Alex")
    openDoor(player)

    player.setKey(true)
    openDoor(player)
}

class Player(val name: String, private var hasKey: Boolean = false) {
    fun checkKey(): Boolean {
        return hasKey
    }

    fun setKey(presence: Boolean) {
        hasKey = presence
    }
}