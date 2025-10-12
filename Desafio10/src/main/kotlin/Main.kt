//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Bem vindo ao super conversor 2000")
    println("Escolha a conversão:")
    println("""
        1: Celsius para Fahrenheit
        2: Fahrenheit para Celsius
        3: Quilômetros para Milhas
        4: Milhas para Quilômetros
    """.trimIndent())
    val option : Int = readln().toInt()
    when (option) {
        1 ->  cTof()
        2 -> fToC()
        3 -> kmToml()
        4 -> mlTokm()
    }
}

fun cTof() : Unit {
    println("Digite o valor em Celsius: ")
    val c : Double = readln().toDouble()
    println("$c°C = ${(c * 9 / 5) + 32}°F")
}

fun fToC() : Unit  {
    println("Digite o valor em Fahrenheit: ")
    val f : Double = readln().toDouble()
    println("$f°F = ${(f - 32) * 5 / 9}°C")
}

fun kmToml() : Unit {
    println("Digite o valor em Quilômetros: ")
    val q : Double = readln().toDouble()
    println("$q KM = ${q * 0.621371}MH")
}

fun mlTokm() : Unit {
    println("Digite o valor em Milhas: ")
    val m : Double = readln().toDouble()
    println("$m MH = ${m * 1.60934}KM")
}
