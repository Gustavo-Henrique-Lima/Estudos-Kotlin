package models

class User {
    var name: String = ""
    var password: String = ""

    fun printNameUpperCase() : Unit{
        println("Olá " + name.uppercase())
    }

    fun updateName(newName: String) : Unit {
        println("Atualizando $name para $newName")
        name = newName
    }

    fun getNameLength() : Int {
        return  name.length
    }

}