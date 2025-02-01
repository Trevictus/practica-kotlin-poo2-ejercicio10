

fun main() {
    val jugador1 = Jugador('X')
    val jugador2 = Jugador('O')

    val tablero = Tablero(
        arrayOf(
            arrayOf(' ', 's', 's'),
            arrayOf('s', 's', 's'),
            arrayOf('s', 's', 's')
        )
    )

    println(tablero.tableroEstaLleno())
}
