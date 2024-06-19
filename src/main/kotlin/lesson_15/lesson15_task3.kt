package org.example.lesson_15

fun main() {
    val user = ForumUser("Jack", 1)
    val admin = ForumAdministrator("Alex", 2)

    user.sendMessage()
    user.readChat()

    admin.sendMessage()
    admin.readChat()
    admin.deleteMessage(1)
    admin.deleteUser(1)
}

abstract class User(val name: String, val id: Int) {
    abstract fun sendMessage()
    abstract fun readChat()
}

class ForumUser(name: String, id: Int) : User(name, id) {
    override fun sendMessage() {
        println("Пользователь $name отправил сообщение")
    }

    override fun readChat() {
        println("Пользователь $name читает чат")
    }
}

class ForumAdministrator(name: String, id: Int) : User(name, id) {
    override fun sendMessage() {
        println("Администратор $name отправил сообщение")
    }

    override fun readChat() {
        println("Администратор $name читает чат")
    }

    fun deleteMessage(id: Int) {
        println("Сообщение $id удалено")
    }

    fun deleteUser(id: Int) {
        println("Пользователь $id удален")
    }

}
