import models.User

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val user1 : User = User()
    user1.name = "Bob"
    user1.password = "123456"

    println(user1.name)
    println(user1.password)

    user1.updatePassword(user1.name)
    println(user1.password)
}