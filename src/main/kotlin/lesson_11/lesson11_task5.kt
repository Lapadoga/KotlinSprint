package org.example.lesson_11

fun main() {
    val forum = Forum()

    forum.createNewUser("Alex")
    forum.createNewMessage(forum.getUserId("Alex"))

    forum.createNewUser("Tom")
    forum.createNewMessage(forum.getUserId("Tom"))

    forum.printThread()
}

class Forum(
    private val userList: ForumUserList = ForumUserList(),
    private val messageList: MutableList<ForumMessage> = mutableListOf(),
) {
    fun createNewUser(userName: String) {
        userList.add(ForumUser.newUser(userList.getSize(), userName))
    }

    fun createNewMessage(userId: Int?) {
        if (userId == null)
            return

        if (userList.contains(userId)) {
            println("Введите сообщение")
            val message = readln()
            messageList.add(ForumMessage.newMessage(userId, message))
        }
    }

    fun getUserId(name: String) = userList.getUserByName(name)?.getId()

    fun printThread() {
        messageList.forEach {
            val author = userList.getUserById(it.getAuthorId())
            if (author != null)
                println("${author.getUserName()}: ${it.getMessage()}")
        }
    }
}

class ForumUser private constructor(
    private val userId: Int,
    private val userName: String,
) {
    companion object {
        fun newUser(id: Int, name: String) = ForumUser(id, name)
    }

    fun getId() = userId
    fun getUserName() = userName
}

class ForumUserList(
    private val userList: MutableList<ForumUser> = mutableListOf(),
) {
    fun contains(id: Int): Boolean {
        userList.forEach {
            if (it.getId() == id)
                return true
        }
        return false
    }

    fun add(user: ForumUser) {
        userList.add(user)
    }

    fun getUserById(id: Int): ForumUser? {
        userList.forEach {
            if (it.getId() == id)
                return it
        }
        return null
    }

    fun getUserByName(name: String): ForumUser? {
        userList.forEach {
            if (it.getUserName() == name)
                return it
        }
        return null
    }

    fun getSize() = userList.size
}

class ForumMessage private constructor(
    private val authorId: Int,
    private val message: String,
) {
    companion object {
        fun newMessage(userId: Int, messageText: String) = ForumMessage(userId, messageText)
    }

    fun getAuthorId() = authorId
    fun getMessage() = message
}