package org.example.lesson_22

import java.util.Calendar

fun main() {
    val guide = GalacticGuide(
        "Alpha Centauri", "Тройная звёздная система в созвездии Центавра",
        Calendar.getInstance().time,
        4.367
    )

    println("Место: ${guide.component1()}, описание: ${guide.component2()}, дата и время: ${guide.component3()}, " +
            "расстояние: ${guide.component4()}")
}

data class GalacticGuide(
    val name: String,
    val description: String,
    val date: java.util.Date,
    val distance: Double,
)