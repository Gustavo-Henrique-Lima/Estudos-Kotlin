//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import models.Button
import models.User

fun main() {

    val user1 = User()
    val user2 = User()

    user1.name = "Bob"
    user2.name = "Alex"

    user1.printNameUpperCase()
    user2.printNameUpperCase()

    user2.updateName("Maria")
    user2.printNameUpperCase()

    val sucessButton = Button()

    sucessButton.text =  "Sucess"
    sucessButton.color = "00FF00"

    val cancelButton = Button()

    cancelButton.text = "Cancel"
    cancelButton.color = "FF0000"
}
