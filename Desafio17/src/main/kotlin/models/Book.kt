package models

data class Book(
    private val title: String,
    private val author: String,
    private val publicationYear: Int,
    private val gender: String,
    private val numberPags: Int
) {


    fun getInfo(): String {
        return "Livro(titulo=${this.title}, autor=${this.author}, " +
                "anoPublicacao=${this.publicationYear}, genero=${this.gender}, paginas=${this.numberPags}"
    }

}