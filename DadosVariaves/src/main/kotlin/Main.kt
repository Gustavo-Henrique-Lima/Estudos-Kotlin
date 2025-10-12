fun main() {
    print("Digite seu nome: ")
    val name: String = readLine().orEmpty()

    print("Digite sua idade: ")
    val age: Int = readLine()?.toIntOrNull() ?: 0

    print("Digite a primeira letra do seu nome: ")
    val firstLetter: Char = readLine()?.firstOrNull() ?: ' '

    print("Digite sua altura (ex: 1.69): ")
    val height: Double = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite seu peso (ex: 55.0): ")
    val width: Double = readLine()?.toDoubleOrNull() ?: 0.0

    print("Você é programador? (true/false): ")
    val isProgrammer: Boolean = readLine()?.toBooleanStrictOrNull() ?: false

    println("\n--- Dados informados ---")
    println("Nome: $name")
    println("Idade: $age")
    println("Primeira letra: $firstLetter")
    println("Altura: $height")
    println("Peso: $width")
    println("É programador? $isProgrammer")
}
