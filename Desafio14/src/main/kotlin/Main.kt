import models.NetworkManager

fun main() {

    println("Status inicial: ${NetworkManager.getStatus()}")
    NetworkManager.connect()
    println("Status atual: ${NetworkManager.getStatus()}")
    NetworkManager.disconnect()
    println("Status atual: ${NetworkManager.getStatus()}")
}