package org.example.lesson_2

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow

fun main() {
    val depositSum = 70_000
    val depositInterestRatePercent = 16.7
    val depositTime: Byte = 20
    val accrualPeriod: Byte = 1
    val divider: Byte = 100

    val amountOfAccruals = depositTime / accrualPeriod
    val depositInterestRate = (depositInterestRatePercent / divider)

    val depositResult = depositSum * (1 + depositInterestRate).pow(amountOfAccruals)
    val result = BigDecimal(depositResult).setScale(3, RoundingMode.DOWN)

    println(result)
}