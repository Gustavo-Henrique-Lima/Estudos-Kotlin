package models

object NetworkManager {

    var isConnected: Boolean = false

    fun connect() {
        this.isConnected = !this.isConnected
        println("Conexão com a internet estabelecida.")
    }

    fun disconnect(){
        this.isConnected = !this.isConnected
        println("Desconexão da internet.")
    }

    fun getStatus(): String{
        return if (isConnected) "Online" else "Offline"
    }
}