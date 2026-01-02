import models.User

fun main() {
    val user1 = User("Bob")
    val user2 = User("Maria")
    User.resetCount()
    val user3 = User("Dan")

}