

fun main() {
    val jugador1 = Jugador('x')
    val jugador2 = Jugador('o')

    val tablero = Tablero(
        arrayOf(
            arrayOf('x', 'o', 'x'),
            arrayOf('o', 'o', 'x'),
            arrayOf('o', 'x', ' ')
        )
    )

    val juego1 = Juego(tablero, arrayOf(jugador1, jugador2), 0)

    juego1.empezarJuego()
}
