package models

class Account(var holder: String) {

    var balance: Double = 0.0

    fun deposit(value: Double) : Unit {
        balance += value
    }

    fun withdraw(value: Double) : Unit {
        if(value < balance){
            balance -= value
            println("Saque realizado com sucesso")
        } else {
            println("Saldo insuficiente para saque")
        }
    }

    fun summary(): Double {
        return balance
    }
}