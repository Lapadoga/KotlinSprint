package org.example.lesson_15

fun main() {
    val temp = Temperature(value = 10)
    val precipitation = PrecipitationAmount(value = 1)

    val server = WeatherServer("127.0.0.1")
    server.sendData(temp)
    server.sendData(precipitation)
}

abstract class WeatherStationStats(val statType: String, val statValue: Int)

class Temperature(type: String = "Температура", value: Int) : WeatherStationStats(type, value)

class PrecipitationAmount(type: String = "Осадки", value: Int) : WeatherStationStats(type, value)

class WeatherServer(val ip: String) {
    fun sendData(data: WeatherStationStats) {
        println("Тип данных: ${data.statType}, значение: ${data.statValue}, отправлено на $ip")
    }
}
