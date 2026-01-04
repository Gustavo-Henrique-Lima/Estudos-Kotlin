import enums.TipoDeCafe

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Bem vindo ao Super Cafe 2000")
    println("Você pediu um ${placeOrder("Espresso")}")
    println("Você pediu um ${placeOrder("Cappuccino")}")
    println("Você pediu um ${placeOrder("Mocha")}")
}

fun placeOrder(name: String): String {
    val coffee = TipoDeCafe.entries.firstOrNull {
        it.friendlyName.equals(name, ignoreCase = true)
    } ?: throw IllegalArgumentException("Café inválido: $name")

    return coffee.friendlyName
}
