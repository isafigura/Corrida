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
    var tanqueAtual: Double = tanque.toDouble()

    fun calcularDesempenho() : Double {
        return (velocidade * 0.4) + (aceleracao * 0.3) + (piloto.habilidade.recarga * 0.1) + (resistencia * 0.1) - (freio * 0.1)
    }

    fun calcularConsumo(): Double {
        return (velocidade * 0.05) + (aceleracao * 0.1) + (consumo * 0.2)
    }
}
