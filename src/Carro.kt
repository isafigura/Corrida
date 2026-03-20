class Carro (
    val velocidade:Double,
    val aceleracao:Double,
    val freio:Int,
    val tanque:Int,
    val consumo:Int,
    val resistencia:Int
)
{
    fun calcularConsumo() : Double{
        return aceleracao * (consumo + velocidade)
    }

    fun calcularAceleracao(pista: Pista) : Double{
        var distanciaPercorrida = pista.voltasPercorridas
    }
}

//Cria uma classe Carro (velocidade, aceleração, freio, tanque, consumo, resistência)