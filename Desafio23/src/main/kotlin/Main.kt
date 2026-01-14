fun main() {

    loginNetflix("exemplo@gmail.com") { username ->
        "usuario $username acessando pelo Smart TV Samsung QLED 4K"
    }
    loginNetflix("exemplo@gmail.com", ::dispositivoIphone)
}

fun dispositivoIphone(username: String): String {
    return "usuario $username acessando pelo iPhone 16 Pro"
}

fun loginNetflix(username: String, dispositivo: (String) -> String) {
    println("conectando com email: $username")
    val resultado = dispositivo(username)
    println("dispositivo conectado: $resultado")
}