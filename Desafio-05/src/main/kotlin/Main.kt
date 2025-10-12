//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Informe a frase 1: ")
    val phrase1: String = readln()
    println("Informe a frase 2: ")
    val phrase2: String = readln()

    if (phrase1.lowercase() == phrase2.lowercase()) println("As frases são iguais")
    else println("As frases não são iguais")

    println("Informe sua idade: ")
    val age: Int = readln().toInt()

    if (age > 18) println("Você pode dirigir")
    else println("Você não pode dirigir")

    if (age > 30) println("Você pode dirigir e é maior do que 30 anos")

    println("Informe o nome do produto: ")
    val name: String = readln()
    println("Informe o valor do produto: ")
    var price: Double = readln().toDouble()

    if(name.lowercase() == "imac" && price >= 10_000) {
        println("desconto aplicado de 12%. Total a pagar: R$ ${price + (price * 0.12) }")
    }


}