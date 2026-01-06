package models

class Fish(name: String, type: String) : Animal(name, type) {

    override fun makeSound(): String {
        return "blu blu"
    }
}