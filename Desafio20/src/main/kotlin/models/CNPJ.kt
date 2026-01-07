package models

class CNPJ(number: String) : Documento(number) {

    override fun valid(): Boolean {
        return number.trim().length == 14
    }


}