package org.example.lesson_2

fun main() {
    val amountOfWorkers: Byte = 50
    val amountOfTrainee: Byte = 30
    val workerSalary: Short = 30000
    val traineeSalary: Short = 20000

    val workerSalaryExpenses = amountOfWorkers * workerSalary
    val generalSalaryExpenses = workerSalaryExpenses + amountOfTrainee * traineeSalary
    val averageWorkerSalary = generalSalaryExpenses / (amountOfWorkers + amountOfTrainee)

    println("Выплаты постоянным сотрудникам: $workerSalaryExpenses")
    println("Общие расходы по ЗП: $generalSalaryExpenses")
    println("Средняя зарплата сотрудника: $averageWorkerSalary")
}