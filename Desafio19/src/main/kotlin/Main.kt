import models.Bird
import models.Fish

fun main() {
    val animalA = Bird("Passaro", "ave")
    val animalB = Fish("Baleia", "mamifero")

    println(animalA.description())
    println(animalB.description())

    println(animalA.makeSound())
    println(animalB.makeSound())
}