package org.example.lesson_19

fun main() {
    val tank = Tank()

    tank.fire()

    tank.loadAmmo(ProjectileType.BLUE)
    tank.fire()

    tank.loadAmmo(ProjectileType.GREEN)
    tank.fire()

    tank.loadAmmo(ProjectileType.RED)
    tank.fire()
}

enum class ProjectileType(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

class Tank {
    private var currentProjectileType: ProjectileType? = null

    fun loadAmmo(projectileType: ProjectileType) {
        currentProjectileType = projectileType
    }

    fun fire() {
        if (currentProjectileType == null)
            println("Танк не заряжен")
        else
            println("Нанесено единиц урона: ${currentProjectileType?.damage}")
    }
}