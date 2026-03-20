fun main() {
    val ferrari = Carro(
        velocidade = 100.0,
        aceleracao = 0.0,
        resistencia = 5,
        consumo = 80,
        freio = 2,
        tanque = 900
    )

    val mustang = Carro(
        velocidade = 120.0,
        aceleracao = 0.0,
        resistencia = 7,
        consumo = 100,
        freio = 7,
        tanque = 900
    )

    val correrRapidao = Habilidade(
        poder = "Correr super rápido",
        recarga = 3
    )

    val piloto = Piloto(
        nome = "Huilson Mustang",
        idade = 18,
        habilidade = correrRapidao
    )

    val carrosParaCorrida = listOf<Carro>(
        ferrari, mustang
    )

    val corrida = Pista(
        carrosParaCorrida, 8, 5, "Ensolarado"
    )
}