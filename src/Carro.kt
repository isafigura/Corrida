class Carro (
    val modelo: String,
    val velocidade: Double,
    val aceleracao: Double,
    val freio: Int,
    val tanque: Int,
    val consumo: Int,
    val resistencia: Int,
    val piloto: Piloto
)
{
    fun calcularDesempenho() : Double {
        return (velocidade * 0.4) + (aceleracao * 0.3) + (piloto.habilidade.recarga * 0.2) + (resistencia * 0.1)
    }

    fun calcularConsumo() : Double {
        return aceleracao * (consumo + velocidade)
    }
}
