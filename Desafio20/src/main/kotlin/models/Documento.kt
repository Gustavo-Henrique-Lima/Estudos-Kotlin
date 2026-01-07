package models

abstract class Documento(val number: String) {

    abstract fun valid() : Boolean
}