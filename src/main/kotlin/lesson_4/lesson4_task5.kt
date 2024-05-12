package org.example.lesson_4

const val MIN_CREW = 55
const val RECOMMENDED_CREW = 70
const val MIN_PROVISION = 50
const val IS_CASE_DAMAGE = true
const val IS_CASE_GOOD_WEATHER = true

fun main() {
    println(
        """
        Введите данные о корабле в следующем порядке:
        1. Число экипажа
        2. Количество провизии
        3. Поврежден ли корабль
        4. Благоприятная ли погода
    """.trimIndent()
    )

    val crew = readln().toInt()
    val provisionAmount = readln().toInt()
    val isDamaged = readln().toBoolean()
    val isGoodWeather = readln().toBoolean()

    val conditionsMet =
        isDamaged != IS_CASE_DAMAGE && (crew in MIN_CREW..RECOMMENDED_CREW) && (provisionAmount > MIN_PROVISION) ||
                isDamaged == IS_CASE_DAMAGE && crew == RECOMMENDED_CREW && isGoodWeather == IS_CASE_GOOD_WEATHER &&
                provisionAmount >= MIN_PROVISION

    println("Корабль может выйти в плавание: $conditionsMet")
}