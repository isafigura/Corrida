class Pista(
    var listaCarros: List<Carro>,
    val voltas: Int,
    val clima: String
) {
    private var ranking: MutableList<Carro> = mutableListOf()

    fun iniciarCorrida() {
        println("\nA corrida com $voltas voltas começou sob o clima $clima!\n")
        
        for (volta in 1..voltas) {
            println("---- VOLTA $volta ----")
            simularVolta()
            exibirPlacar()
            println()
            Thread.sleep(1000)
        }
        
        println("==== FIM DA CORRIDA ====")
        println("O GRANDE VENCEDOR É: ${ranking.first().modelo} com o piloto ${ranking.first().piloto.nome}!")
    }

    private fun simularVolta() {
        ranking = listaCarros.sortedByDescending { it.calcularDesempenho() + (0..10).random() }.toMutableList()
    }

    fun exibirPlacar() {
        if (ranking.isEmpty()) {
            println("A corrida ainda não começou!")
            return
        }
        
        ranking.forEachIndexed { index, carro ->
            println("${index + 1}º Lugar: ${carro.modelo} - Piloto: ${carro.piloto.nome}")
        }
    }
}
