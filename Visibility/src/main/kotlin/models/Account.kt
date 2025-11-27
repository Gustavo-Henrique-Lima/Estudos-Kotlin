package models

class Account(var holder: String, var balance: Double) {

    private val TAX : Double = 3.15

    init {
        println("O valor da taxa é de $TAX")
    }
}