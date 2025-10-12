//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Digite seu nome: ")
    val name: String = readLine().orEmpty()

    print("Digite o seu ano de nascimento: ")
    val year: Int = readLine()?.toIntOrNull() ?: 0

    println("Olá ${name}. Em 2050 você terá ${2050 - year} anos. Seu nome possui ${name.length} caracteres.")
}