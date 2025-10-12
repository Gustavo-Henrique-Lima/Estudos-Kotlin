//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Informe um número: ")
    var number: Int = readln().toInt()
    var i: Int = 0
    while ( i <= 10 ) {
        println(number)
        number *=2
        i++
    }

    var limit: Int =10
    for (j in 0 .. limit){
        println(j)
    }
}