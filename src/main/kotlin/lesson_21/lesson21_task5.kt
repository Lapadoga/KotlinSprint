package org.example.lesson_21

fun main() {
    val mapOfSkills = mapOf("Вихрь" to 4, "Двойной прыжок" to 5, "Дымовая бомба" to 2)
    println(mapOfSkills.maxCategory())
}

fun Map<String, Int>.maxCategory(): String {
    val maxValue = values.max()
    var maxSkill = ""

    for (pair in this) {
        if (pair.value == maxValue) {
            maxSkill = pair.key
            break
        }
    }
    return maxSkill
}