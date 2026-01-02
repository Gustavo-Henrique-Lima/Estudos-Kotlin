import models.Database
import kotlin.math.log

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val user: String = "Brown"

    println(Database.name)
    println(Database.user)
    login(user)
    println(Database.user)

    val userB: String = "Bruce"

    login(userB)

    println(Database.user)
}

fun login(user: String){
    Database.user = user
}