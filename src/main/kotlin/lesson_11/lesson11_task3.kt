package org.example.lesson_11

fun main() {
    val member1 = Member(1, "Jack", Status.SPEAKING)
    val membersList = MemberList(mutableListOf(member1))
    val room = Room(1, "", "Room 1", membersList)

    println(room.toString())
    println("----------------------------------------")

    val member2 = Member(2, "Alex", Status.MUTED)
    room.addMember(member2)
    println(room.toString())

    room.setMemberStatus("Alex", Status.SPEAKING)

    println("----------------------------------------")
    println(room.toString())
}

enum class Status {
    SPEAKING, MICRO_OFF, MUTED,
}

class Member(
    private val id: Int,
    private val nickname: String,
    private var status: Status,
) {
    fun setStatus(newStatus: Status) {
        status = newStatus
    }

    override fun toString() = "Участник: $nickname, статус: $status"

    fun getNickname() = nickname
}

class Room(
    private val id: Int,
    private val cover: String,
    private val name: String,
    private val membersList: MemberList,
) {
    fun addMember(newMember: Member) {
        membersList.addMember(newMember)
    }

    fun setMemberStatus(memberName: String, newStatus: Status) {
        val member = membersList.findByName(memberName)
        member?.setStatus(newStatus)
    }

    override fun toString(): String {
        val roomString = """
            Имя комнаты: $name
            Список участников:
            $membersList
        """.trimIndent()
        return roomString
    }
}

class MemberList(private val memberList: MutableList<Member>) {
    fun addMember(newMember: Member) {
        memberList.add(newMember)
    }

    fun findByName(name: String): Member? {
        memberList.forEach {
            if (it.getNickname() == name)
                return it
        }
        return null
    }

    override fun toString() = memberList.joinToString("; ")
}