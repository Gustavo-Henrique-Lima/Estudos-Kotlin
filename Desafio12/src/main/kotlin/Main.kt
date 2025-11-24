import models.Account

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    println("Informe o nome do titular da conta: ")
    val holder: String = readln()

    if(holder.isNotEmpty()){
        val account = Account(holder)
        println("Conta criada com sucesso")
        println("Dados da conta: ")
        println("Titular: ${account.holder}")
        println("Saldo atual: ${account.balance}")
        var option : Int = 99;
        while (option != 0) {
            println("Atualmente nosso sistema bancário disponibiliza as seguinte operações: ")
            println("1 - Depositar")
            println("2 - Sacar")
            println("3 - Consultar saldo")
            println("0 - Sair")
            print("Por favor, informe o número correspondente a sua opção e aperte enter: ")
            option = readln().toInt();
            if(option<0 || option>3){
                println("Opção inválida, tente novamente")
                println()
            } else if (option == 0) {
                println("Sistema bancário encerrado")
            } else {
                when (option) {
                    1 -> {
                        println("Informe o valor a ser depositado: ")
                        val value : Double = readln().toDouble()
                        if(value > 0.0){
                            account.deposit(value)
                            println("Depósito realizado com sucesso")
                            println()
                        } else {
                            println("O valor de depósito deve ser maior do que zero")
                            println()
                        }
                    }
                    2 -> {
                        println("Informe o valor a ser sacado: ")
                        val value : Double = readln().toDouble()
                        if(value > 0.0){
                            account.withdraw(value)

                            println()
                        } else {
                            println("O valor de saque deve ser maior do que zero")
                            println()
                        }
                    }
                    3 -> {
                        val value : Double = account.summary()
                        println("O saldo de ${account.holder} é de R$${account.balance}")
                        println()
                    }
                }
            }
        }
    }

}