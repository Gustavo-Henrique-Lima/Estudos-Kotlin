import kotlin.random.Random

fun main() {
    print("Por favor, informe a quantidade de apostas que você deseja gerar: ")
    val qtd: Int = readln().toInt()
    if (qtd < 1) {
        println("A quantidade de apostas deve ser maior do que 0")
    } else {
        for (i in 0 until qtd) {
            println("Aposta ${i + 1}")
            val game = randomGame()
            println("Lista gerada: $game")
        }
    }
}
fun randomGame(): Set<Int> {
    val numbers = mutableSetOf<Int>()

    while (numbers.size < 6) {
        numbers.add(Random.nextInt(1, 61))
    }

    return numbers
}