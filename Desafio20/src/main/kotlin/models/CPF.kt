package models

class CPF(number: String) : Documento(number) {

    override fun valid(): Boolean {
        return number.trim().length == 11
    }


}