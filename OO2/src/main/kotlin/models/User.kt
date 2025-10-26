package models

class User {

    var name: String = ""
    var password: String = ""

    fun updatePassword(initialValue: String) : Unit {
        password = initialValue.hashCode().toString()
    }
}