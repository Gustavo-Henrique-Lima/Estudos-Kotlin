import models.GPS

fun main() {

    val gps = GPS("37.334606", "-122.009102")

    val (lat, lon) = gps

    println("Apple Park Location -> Latitude: $lat, Longitude: $lon")
}