fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9)

    val sum = acumulador(numbers)
    print("A soma da lista ")
    numbers.forEach {
        print("$it,")
    }
    print(" é: $sum")
}

fun acumulador(numbers: List<Int>): Int {
    return numbers.sum()
}

