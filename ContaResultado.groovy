class ContaResultado {

	static def votos;

	def static calcular (op) {
		if (op == 3)
			calcularVotosQuantidade()
		else (op == 4)
			calcularPorcetagemVotos ()
	}

	def static calcularVotosQuantidade() {
		Votacao.mapaVotacao.each { numero, qtdVotos ->
			def nome = CadastraCandidatos.mapaCandidatos[numero]
			println "Chapa $numero | Nome $nome | Quantidade de votos $qtdVotos"
		}
	}

	def static calcularPorcetagemVotos () {
		votos = Votacao.mapaVotacao.values().sum()
		Votacao.mapaVotacao.each { numero, qtdVotos ->
			def nome = CadastraCandidatos.mapaCandidatos[numero]
			def porcentagemVotos = qtdVotos / votos * 100
			println "Chapa $numero | Nome $nome | Porcentagme de votos $porcentagemVotos"
		}
	}
}
	
