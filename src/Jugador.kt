class Jugador(val simbolo: Char) {

    fun hacerMovimiento(): Array<Int> {
        while (true) {
            println("Introduce coordenada separada por coma jugador $simbolo (0,0): ")
            val entrada = readln()
            val regex = Regex("^\\d,\\d$")

            if (regex.matches(entrada)) {
                return entrada.split(",").map { it.toInt() }.toTypedArray()
            } else {
                println("Inténtalo de nuevo!")
            }

        }
    }
}