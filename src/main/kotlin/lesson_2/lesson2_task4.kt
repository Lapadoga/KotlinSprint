package org.example.lesson_2

fun main() {
    val amountOfCrystal: Byte = 7
    val amountOfIron: Byte = 11
    val buffPercent = 20f
    val divider: Byte = 100
    val buffBonus = buffPercent / divider

    val crystalBonus = amountOfCrystal * buffBonus
    val ironBonus = amountOfIron * buffBonus

    println("Кристаллическая руда: %,.0f".format(crystalBonus))
    println("Железная руда: %,.0f".format(ironBonus))
}