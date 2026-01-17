//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9)
    val result = listaEmDobro(numbers)
    print("A lista ")
    for (n in numbers) {
        print("$n, ")
    }
    print("em dobro seria: $result")

}

fun listaEmDobro(numbers: List<Int>) : List<Int> {

    val result = numbers.map { number -> number * 2 }
    return result
}