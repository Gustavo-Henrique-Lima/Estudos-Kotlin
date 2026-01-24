//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    div(10, 0)
    mult("xx", "1")

    showView()

}

fun div(x: Int, y: Int){
    try {
        println(x / y)
    }
    catch (e: ArithmeticException){
        println("A divisão por zero não é permitida")
    }
}

fun mult(x: String, y: String){
    try {
        val a : Int = Integer.parseInt(x)
        val b : Int = Integer.parseInt(y)
        println(a * b)
    }
    catch (e: NumberFormatException){
        println(e.message)
    }
}

fun showView(){
    try {
        val result = applyDiscount(100.0, 20)
        println(result)
    } catch (e: IllegalArgumentException){
        println(e.message)
    }

}

fun applyDiscount(price: Double, value: Int) : Double{
    if(value > 50){
        throw IllegalArgumentException("Desconto muito alto")
    }
    val discount = value * price / 100
    return price - discount
}