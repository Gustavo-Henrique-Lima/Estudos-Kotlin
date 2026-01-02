package models

class User (var name: String) {

    companion object {
        var count: Int = 0

        fun resetCount() {
            this.count = 0
        }
    }

    init {
        count++
        println(count)
    }

}