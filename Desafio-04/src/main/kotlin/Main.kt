//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Informe um dia no formato (SEG, TER, QUA): ")
    val day: String = readln()

    when (day.lowercase()) {
        "seg", "ter", "qua", "qui", "sex" -> println("O dia informado é um dia de semana.")
        "sab", "dom" -> println("O dia informado é um final de semana")
        else -> println("Nenhum dia encontrado, tente novamente")
    }
}