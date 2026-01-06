package models

open class Animal(private var name: String, private var type: String){

    fun description() : String {
        return "O animal $name é do tipo $type"
    }

    open fun makeSound(): String  {
        return "song"
    }

}