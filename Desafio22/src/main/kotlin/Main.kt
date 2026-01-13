//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9)
    val pars = numbers.filter { it % 2 ==0 }
    print("A lista ")
    numbers.forEach {
        print("$it,")
    }
    print(" possui os pares: $pars")
}