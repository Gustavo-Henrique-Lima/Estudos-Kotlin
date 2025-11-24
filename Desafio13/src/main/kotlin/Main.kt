import models.Calculator

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val calculator = Calculator(10.0, 2.0)

    val resultSum = calculator.sum()
    val resultSub = calculator.sub()
    val resultMult = calculator.mult()
    val resultDiv = calculator.div()

    println("O resultado da soma é: $resultSum")
    println("O resultado da subtração é: $resultSub")
    println("O resultado da multiplicação é: $resultMult")
    println("O resultado da divisão é: $resultDiv")
}