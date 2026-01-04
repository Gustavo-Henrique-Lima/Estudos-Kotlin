package models

data class User(private var name: String, private var isAdmin: Boolean) {

    fun descritption(): String = "Meu nome é $name"

    fun nameLength(): Int = name.length
}