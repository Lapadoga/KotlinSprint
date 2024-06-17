package org.example.lesson_14

fun main() {
    val planet = Planet("Марс", hasAtmosphere = false, isSuitableForLanding = true)
    planet.satelliteSet.add(Satellite("Фобос", hasAtmosphere = false, isSuitableForLanding = true))
    planet.satelliteSet.add(Satellite("Деймос", hasAtmosphere = false, isSuitableForLanding = true))

    planet.print()
}

abstract class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isSuitableForLanding: Boolean,
)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding) {
    override fun toString(): String {
        return name
    }
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    val satelliteSet: MutableSet<Satellite> = mutableSetOf(),
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding) {
    fun print() {
        println("Название планеты: $name, список спутников: ${satelliteSet.joinToString(", ")}")
    }
}