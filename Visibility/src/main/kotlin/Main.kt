import models.Account
import models.PlayerVideo

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val accountA = Account("Gustavo", 100.0)

    val control = PlayerVideo(50)
    control.getVolume()

    control.increaseVolume(51)
    control.getVolume()

    control.increaseVolume(5)
    control.getVolume()

    control.increaseVolume(5)
    control.getVolume()

    control.decreaseVolume(5)
    control.getVolume()

    control.decreaseVolume(56)
    control.getVolume()

}