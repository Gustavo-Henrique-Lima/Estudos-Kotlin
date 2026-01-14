package models

class User(private var name: String, private var isAdmin: Boolean) {

    fun getName(): String {
        return name
    }

    fun getAdmin(): Boolean {
        return isAdmin
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (isAdmin != other.isAdmin) return false
        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        var result = isAdmin.hashCode()
        result = 31 * result + name.hashCode()
        return result
    }


}