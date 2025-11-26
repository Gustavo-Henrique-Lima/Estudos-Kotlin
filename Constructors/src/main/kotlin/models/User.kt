package models

class User (var name: String, var lastName: String, var isAdmin: Boolean) {

    //var - mutável
    //val - imutável
    var label: String = "$name é admin do sistema: $isAdmin"
    init {
        println("Olá $name")
    }

    constructor(name: String, isAdmin: Boolean) : this(name, "", isAdmin) {
    }

    constructor(name: String) : this(name, "", false){
        if(name.length <=3 ){
            println("Usuário $name possui poucos caracteres!")
        }
    }

    fun printInfo(){
        println("Nome $name, Sobrenome: $lastName isAdmin: $isAdmin ")
    }
}
