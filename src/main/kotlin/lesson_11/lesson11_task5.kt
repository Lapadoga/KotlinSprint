package org.example.lesson_11

fun main() {
    val forum = Forum()

    val userJack = forum.createNewUser("Jack")
    val userMike = forum.createNewUser("Mike")

    forum.createNewMessage(userJack.userId)
    forum.createNewMessage(userMike.userId)
    forum.createNewMessage(userJack.userId)
    forum.createNewMessage(userMike.userId)

    forum.printThread()
}

class ForumUser(
    val userId: Int,
    val userName: String,
)

class ForumMessage(
    val authorId: Int,
    val message: String,
)

class Forum(
    val userMap: MutableMap<Int, ForumUser> = mutableMapOf(),
    val messageList: MutableList<ForumMessage> = mutableListOf(),
) {
    fun createNewUser(userName: String): ForumUser {
        val userId = userMap.size
        val newUser = ForumUser(userId, userName)
        userMap[userId] = newUser

        return newUser
    }

    fun createNewMessage(userId: Int): ForumMessage? {
        if (userMap[userId] != null) {
            println("Введите сообщение")
            val message = readln()

            val newMessage = ForumMessage(userId, message)
            messageList.add(newMessage)

            return newMessage
        } else {
            println("Данного пользователя не существует")
            return null
        }
    }

    fun printThread() {
        messageList.forEach {
            println("${userMap[it.authorId]?.userName}: ${it.message}")
        }
    }
}