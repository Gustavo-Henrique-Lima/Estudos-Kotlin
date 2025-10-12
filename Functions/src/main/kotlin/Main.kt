//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    helloWorld()

    val result: Int = sum(3,2)
    print(result)
}

fun helloWorld(){
    println("Olá mundo")
}

fun sum(num1: Int, num2: Int) : Int{
    return  num1 + num2
}