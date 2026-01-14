import models.User

fun main() {
    val users = setOf<User>(
        User("Tiago", true),
        User("Lucas", true),
        User("Tiago", true)
    )

    users.forEach { println(it.getName()) }
}