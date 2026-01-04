import models.User

fun main() {
    val userA = User("Bob", false)
    val userB = User("Bob", false)

    println(userA.descritption())
    println(userA.nameLength())
    println(userA == userB)
}