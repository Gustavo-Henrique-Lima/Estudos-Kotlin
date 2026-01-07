import models.CNPJ
import models.CPF

fun main() {
    val cpf = CPF("12345678901")
    val cnpj = CNPJ("12345678000195")

    val isCpfValid = cpf.valid()
    println(
        if (isCpfValid)
            "CPF: Documento ${cpf.number} é válido"
        else
            "CPF: Documento ${cpf.number} não é válido"
    )

    val isCnpjValid = cnpj.valid()

    println(
        if (isCnpjValid)
            "CPNJ: Documento ${cnpj.number} é válido"
        else
            "CNPJ: Documento ${cnpj.number} não é válido"
    )
}