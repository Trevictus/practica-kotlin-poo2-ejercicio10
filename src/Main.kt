

fun main() {
    val jugador1 = Jugador('x')
    val jugador2 = Jugador('o')

    val tablero = Tablero(
        arrayOf(
            arrayOf(' ', ' ', ' '),
            arrayOf(' ', ' ', ' '),
            arrayOf(' ', ' ', ' ')
        )
    )

    val juego1 = Juego(tablero, arrayOf(jugador1, jugador2), 0)

    juego1.empezarJuego()
}
