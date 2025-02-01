class Juego(val tablero: Tablero, val jugadores: Array<Jugador>, var jugadorActual: Int) {

    fun empezarJuego(){

        var finalizar = false
        while (!finalizar){
            tablero.dibujarTablero()
            finalizar = jugarTurno()
            if (finalizar) {
                tablero.dibujarTablero()
                finalizarJuego()
            }
            if(tablero.tableroEstaLleno() && !finalizar){
                finalizar = true
            }
            cambiarJugador()
        }
    }

    fun cambiarJugador(){
        if(jugadorActual == 0){
            jugadorActual = 1
        }else{
            jugadorActual = 0
        }
    }

    fun jugarTurno(): Boolean{
        val jugada = jugadores[jugadorActual].hacerMovimiento()

        val valido = tablero.actualizarTablero(jugada[0], jugada[1],jugadores[jugadorActual].simbolo)
        if (!valido){
            jugarTurno()
        }
        return tablero.esGanador(jugada[0],jugada[1],jugadores[jugadorActual].simbolo) != ' '
    }

    fun finalizarJuego(){
        println("Enhorabuena jugador ${jugadores[jugadorActual].simbolo}")
    }

}