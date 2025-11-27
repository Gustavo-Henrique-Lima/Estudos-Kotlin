package models

class PlayerVideo(private var volume: Int) {

    fun increaseVolume(toIncrease: Int) {
        if((volume + toIncrease) < 100){
            volume += toIncrease
        }
        else {
            println("O volume já está no máximo")
        }
    }

    fun decreaseVolume(toDecrease: Int) {
        if((volume - toDecrease) > 0) {
            volume -= toDecrease
        }
        else {
            println("O volume já está no mínimo")
        }
    }

    fun getVolume() {
        println(volume)
    }

}