fun main() {
    calcularDesconto(precoOriginal = 100.0, desconto = 10.0, imposto = 5.0, promocao = "Black Friday")
    calcularDesconto(precoOriginal = 200.0, imposto = 20.0)
    calcularDesconto(precoOriginal = 50.0, promocao = "Natal")
}

fun calcularDesconto(precoOriginal: Double, desconto: Double = 0.0, imposto: Double = 5.0, promocao: String = "") {
    val precoComDesconto = precoOriginal - desconto
    val precoFinal = precoComDesconto + imposto

    println("Resumo da Transação ======")
    println("Preço Original: R$$precoOriginal")
    if (desconto > 0) println("Desconto: R$$desconto")
    if (imposto > 0) println("Imposto: R$$imposto")
    if (promocao != "") println("Promoção: $promocao")
    println("Preço Final: R$$precoFinal")
    println()
}