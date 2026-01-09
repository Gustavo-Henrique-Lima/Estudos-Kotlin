import models.User

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var numbers = intArrayOf(1,2,3,4,5,6,7,8,152)
    println("Primeira forma")
    for (i in 0 until numbers.size){
        println(numbers[i])
    }
    println("------------")
    println()
    println("Segunda forma")
    for(number in numbers){
        println(number)
    }
    println("------------")
    println()
    println("Terceira forma")
    numbers.forEach { number ->
        println(number)
    }
    println("------------")
    numbers = numbers.plus(465)
    numbers.forEach { number ->
        println(number)
    }
    val users = arrayOf<User>(
        User("bob@email.com", "123465"),
        User("maria@email.com", "8756646"),
        User("my@email.com", "789456")
    )

    users.forEach { user->
        println(user.email)
    }
}