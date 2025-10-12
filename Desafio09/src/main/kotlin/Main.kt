//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var option : Int = 99;
    while (option != 0){
        println("Atualmente nossa calculadora disponibiliza as seguinte operações: ")
        println("1 - Adição")
        println("2 - Subtração")
        println("3 - Multiplicação")
        println("4 - Divisão")
        println("0 - Desligar")
        print("Por favor, informe o número correspondente a sua opção e aperte enter: ")
        option = readln().toInt();
        if(option<0 || option>4){
            println("Opção inválida, tente novamente")
        } else if (option == 0) {
            println("Calculadora encerrada")
        } else {
            print("Informe o primeiro número para o cálculo: ")
            val num1 : Int = readln().toInt()
            print("Informe o segundo número para o cálculo: ")
            val num2 : Int = readln().toInt()
            var result : Int = -99
            when (option) {
                1 ->  result = add(num1, num2)
                2 -> result = sub(num1, num2)
                3 -> result = mul(num1, num2)
                4 -> if(num1==0 || num2==0){
                    println("Não é possível realizar divisão por zero")
                } else {
                    result = div(num1, num2)
                }
            }
            if(result == -99){
                println("Algo deu errado no cálculo, por favor tente novamente")
            } else{
                println("O resultado do cálculo é: ${result}")
            }
        }

    }
}

fun add(num1: Int, num2: Int) = num1+num2

fun sub(num1: Int, num2: Int) = num1-num2

fun mul(num1: Int, num2: Int) = num1*num2

fun div(num1: Int, num2: Int): Int = num1 / num2
