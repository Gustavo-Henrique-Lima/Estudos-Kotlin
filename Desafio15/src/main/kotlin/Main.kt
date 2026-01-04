import models.PS4Controller

fun main() {

    val controller = PS4Controller()
    print("PS4 Controller com ")
    for (button in controller.buttons) {
        print(button.getName() + " ")
    }
    println()
    println(controller.triangulo.press())
    println(controller.cruz.press())
    println(controller.r1.press())
    /*
    for (button in controller.buttons) {
        println(button.press())
    }*/

}