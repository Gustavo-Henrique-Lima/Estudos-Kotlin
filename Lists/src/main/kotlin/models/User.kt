package models

class User(private var name: String, private var isAdmin: Boolean) {

    fun getName() : String {
        return  name
    }

    fun getAdmin() : Boolean{
        return isAdmin
    }
}