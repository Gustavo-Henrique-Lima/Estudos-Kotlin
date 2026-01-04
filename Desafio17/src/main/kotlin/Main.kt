import models.Book

fun main() {

    val bookA = Book(
        "O Hobbit", "J.R.R. Tolkien", 1937, "Fantasia",
        310
    )
    val bookB = Book(
        "1984", "George Orwell", 1949, "Distopia",
        328
    )

    println(bookA.getInfo())
    println("=======")
    println(bookB.getInfo())
    println("=======")
}
