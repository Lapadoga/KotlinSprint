package org.example.lesson_17

class QuizElement(questionText: String, answerText: String) {
    val question = questionText
        get() = field

    var answer: String = answerText
        get() = field
        set(value) {
            field = value
        }
}