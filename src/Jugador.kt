class Jugador(val simbolo: Char) {

    fun hacerMovimiento(): Array<Int>{
        println("Introduce coordenada separada por coma jugador $simbolo (0,0): ")
        val movimiento = readln().split(",").map { it.toInt() }.toTypedArray()


        return movimiento
    }
}