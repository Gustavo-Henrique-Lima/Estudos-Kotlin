package models

class Bird(name: String, type: String) : Animal(name, type){

    override fun makeSound(): String {
        return "Bem te vi"
    }
}