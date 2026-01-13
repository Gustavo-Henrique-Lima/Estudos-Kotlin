import models.User

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Lista imutável
    val contacts = listOf("Pedro", "Bruna", "João")
    val c = contacts.firstOrNull()
    println(c)
    println(contacts.indexOf("Bruna"))
    println(contacts)

    val con = contacts.joinToString(";")
    println(con)

    //Lista mutável
    val contact = mutableListOf("Maria", "Bob", "Brown")
    println(contact)
    contact.addLast("Armando")
    println(contact)
    println("------------")
    contacts.filterTo(contact, {it.contains("B")})
    println(contact)
    println("------------")
    val a = listOf("A", "B")
    val b = listOf("C", "D")

    val cc = listOf(a,b)
    println(cc)
    println(cc.flatten())
    println("------------")
    val users = mutableListOf<User>(User("Bob", true),
        User("Maria", true),
        User("Brown", false))
    val filteredUsers = users.filter { user ->
        //user.getAdmin()
        user.getName().lowercase().contains("b")
    }
    filteredUsers.forEach {
        println("${it.getName()}:${it.getAdmin()}")
    }
}