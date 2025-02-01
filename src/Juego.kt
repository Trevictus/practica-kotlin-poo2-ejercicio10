class Juego(val tablero: Tablero, val jugadores: Array<Jugador>, val jugadorActual: Int) {

    fun empezarJuego(){
        val jugador1Simbolo = 'x'
        val jugador2Simbolo = 'o'

        var finalizar = false
        while (!finalizar){
            tablero.dibujarTablero()
            finalizar = jugarTurno()

            cambiarJugador()
        }
        finalizarJuego()
    }

    fun cambiarJugador(){

    }

    fun jugarTurno(): Boolean{
        val jugada = jugadores[jugadorActual].hacerMovimiento()
        tablero.actualizarTablero(jugada[0], jugada[1],jugadores[jugadorActual].simbolo)
        if(tablero.esGanador(jugada[0],jugada[1],jugadores[jugadorActual].simbolo) != ' '){
            return true
        }
        return false
    }

    fun finalizarJuego(){
        println("Enhorabuena ${jugadores[jugadorActual]}")
    }

}