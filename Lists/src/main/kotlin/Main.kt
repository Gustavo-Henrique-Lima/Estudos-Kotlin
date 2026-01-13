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
}