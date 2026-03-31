fun main() {
    // Skills
    val ninja = Habilidade("Ninja", 10)
    val novato = Habilidade("Sorte", 5)
    val veterano = Habilidade("Experiente", 15)

    // Pilots
    val piloto1 = Piloto("Huilson Mustang", 18, veterano)
    val piloto2 = Piloto("Claudio Carrera", 25, ninja)
    val piloto3 = Piloto("Binho Fusca", 45, novato)

    // Cars
    val ferrari = Carro(
        modelo = "Ferrari F1",
        velocidade = 120.0,
        aceleracao = 5.0,
        resistencia = 8,
        consumo = 80,
        freio = 2,
        tanque = 900,
        piloto = piloto1
    )

    val mustang = Carro(
        modelo = "Mustang GT",
        velocidade = 110.0,
        aceleracao = 6.0,
        resistencia = 9,
        consumo = 100,
        freio = 7,
        tanque = 900,
        piloto = piloto2
    )

    val fusca = Carro(
        modelo = "Fusca 66",
        velocidade = 125.0,
        aceleracao = 2.0,
        resistencia = 10,
        consumo = 40,
        freio = 10,
        tanque = 500,
        piloto = piloto3
    )

    val carrosParaCorrida = listOf(ferrari, mustang, fusca)

    val corrida = Pista(
        listaCarros = carrosParaCorrida,
        voltas = 3,
        clima = "Ensolarado"
    )

    corrida.iniciarCorrida()
}