package models

class PS4Controller {

    val triangulo = Button("Triangulo")
    val circulo = Button("Circulo")
    val cruz = Button("Cruz")
    val quadrado = Button("Quadrado")
    val l1 = Button("L1")
    val r1 = Button("R1")

    val buttons: List<Button> = listOf(
        triangulo, circulo, cruz, quadrado, l1, r1
    )

    class Button(private var name: String){

        fun press() : String {
            return "${this.name} botão: pressionado!"
        }

        fun getName(): String {
            return this.name
        }
    }
}