package models

class Calculator(var x: Double, var y: Double) {

    fun sum(): Double {
        return x+y
    }

    fun sub(): Double {
        return  x-y
    }

    fun mult(): Double {
        return x*y
    }

    fun div(): Double {
            return x/y
    }
}