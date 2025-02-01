class Tablero(var tablero: Array<Array<Char>>) {

    fun dibujarTablero() {
        for (fila in tablero) {
            for (columna in fila) {
                print("[$columna ]")
            }
            println()
        }
    }

    fun esMovimientoValido(fila: Int, columna: Int): Boolean {
        if (tablero[fila][columna] == ' ') {
            return true
        }
        println("Esta posición no es válida.")
        return false
    }

    fun actualizarTablero(fila: Int, columna: Int, simbolo: Char): Boolean {
        if (esMovimientoValido(fila, columna)) {
            tablero[fila][columna] = simbolo
            return true
        }
        return false
    }

    fun esGanador(fila: Int, columna: Int, simbolo: Char): Char {

        for (i in 0 until 2) {
            for (j in 0 until 2) {

                // Comprobar arriba
                if (fila > 0 && tablero[fila - 1][columna] == simbolo) {
                    // Coincide con el de arriba
                    if (fila - 1 > 0 && tablero[fila - 2][columna] == simbolo) {
                        return simbolo
                    }
                    if (fila + 1 < 3 && tablero[fila + 1][columna] == simbolo) {
                        return simbolo
                    }

                }

                // Comprobar abajo
                if (fila < 2 && tablero[fila + 1][columna] == simbolo) {
                    // Coincide con el de abajo
                    if (fila + 1 < 2 && tablero[fila + 2][columna] == simbolo) {
                        return simbolo
                    }
                    if (fila > 0 && tablero[fila - 1][columna] == simbolo) {
                        return simbolo
                    }
                }

                // Comprobar izquierda
                if (columna > 0 && tablero[fila][columna - 1] == simbolo) {
                    // Coincide con el de la izquierda
                    if (columna - 1 > 0 && tablero[fila][columna - 2] == simbolo) {
                        return simbolo
                    }
                    if (columna + 1 < 3 && tablero[fila][columna + 1] == simbolo) {
                        return simbolo
                    }
                }

                // Comprobar derecha
                if (columna < 3 - 1 && tablero[fila][columna + 1] == simbolo) {
                    // Coincide con el de la derecha
                    if (columna + 1 < 2 && tablero[fila][columna + 2] == simbolo) {
                        return simbolo
                    }
                    if (columna > 0 && tablero[fila][columna - 1] == simbolo) {
                        return simbolo
                    }
                }

                // Comprobar diagonales si es necesario
                if (tablero[1][1] == simbolo && tablero[0][0] == simbolo && tablero[2][2] == simbolo) {
                    return simbolo
                }
                if (tablero[0][2] == simbolo && tablero[1][1] == simbolo && tablero[2][0] == simbolo) {
                    return simbolo
                }
                // Comprobar arriba-izquierda, arriba-derecha, abajo-izquierda, abajo-derecha
            }
        }
        return ' '
    }

    fun tableroEstaLleno(): Boolean {
        var lleno: Boolean = true
        for (filas in 0..2) {
            for (columnas in 0..2) {
                if (tablero[filas][columnas] == ' ') {
                    lleno = false
                }
            }
        }
        if (lleno) {
            println("TABLAS!!!")
        }
        return lleno
    }
}