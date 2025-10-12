//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Por favor informe a hora: ")
    val hour: Int = readln().toInt()
    val result: String = meeting(hour);
    print(result)
}

fun meeting(hour: Int): String =
    when (hour) {
        in 6..12 -> "Bom dia flor do dia!"
        in 12..18 -> "Boa tarde!"
        in 18..24 -> "Boa noite, amigo!"
        in 0..6 -> "Boa madrugada, guerreiro!"
        else -> "Digite um valor válido de 0h às 24h"
    }

