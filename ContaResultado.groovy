class ContaResultado {

	def static calcular (op) {

		calcularVotosQuantidade()
	}

	def static calcularVotosQuantidade() {
		Votacao.mapaVotacao.each { numero, qtdVotos ->
			def nome = CadastraCandidatos.mapaCandidatos[numero]
			println "Chapa $numero | Nome $nome | Quantidade de votos $qtdVotos"
		}
	}
}
	
