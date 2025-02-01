class Tablero(var tablero: Array<Array<Char>>) {

//    fun crearTablero(){
//        tablero = arrayOf(arrayOf(' ',' ',' '),
//                          arrayOf(' ',' ',' '),
//                          arrayOf(' ',' ',' '))
//    }

    fun esMovimientoValido(fila: Int, columna: Int): Boolean{
        if (tablero[fila][columna] == ' '){
            return true
        }
        return false
    }

    fun actualizarTablero(fila: Int, columna: Int, simbolo: Char){
        if (esMovimientoValido(fila, columna)){
            tablero[fila][columna] = simbolo
        }

    }

    fun esGanador(fila: Int, columna: Int, simbolo: Char): Char{

        for (i in 0 until 2) {
            for (j in 0 until 2) {
                val simbolo = tablero[fila][columna]

                // Comprobar arriba
                if (fila > 0 && tablero[fila-1][columna] == simbolo) {
                    // Coincide con el de arriba
                    if (fila - 1 > 0 && tablero[fila-2][columna] == simbolo){
                        return simbolo
                    }
                    if (fila + 1 < 3 && tablero[fila+1][columna] == simbolo){
                        return simbolo
                    }

                }

                // Comprobar abajo
                if (fila < 2 && tablero[fila+1][columna] == simbolo) {
                    // Coincide con el de abajo
                    if(fila + 1 < 2 && tablero[fila+2][columna] == simbolo){
                        return simbolo
                    }
                    if(fila - 1 > -1 && tablero[fila-1][columna] == simbolo){

                    }
                }

                // Comprobar izquierda
                if (columna > 0 && tablero[fila][columna-1] == simbolo) {
                    // Coincide con el de la izquierda
                }

                // Comprobar derecha
                if (columna < 3-1 && tablero[fila][columna+1] == simbolo) {
                    // Coincide con el de la derecha
                }

                // Comprobar diagonales si es necesario
                // Comprobar arriba-izquierda, arriba-derecha, abajo-izquierda, abajo-derecha
            }
        }

    }

    fun tableroEstaLleno(): Boolean{
        return false
    }
}