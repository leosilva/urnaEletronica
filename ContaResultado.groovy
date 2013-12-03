class ContaResultado {

	def static votos = [:]

	def static calcular (op) {
		CadastraCandidatos.mapaCandidatos.each { numero, nome ->
			println "Nome: $nome  --  Chapa $numero"
		}
	}

	def calcularVotosPorcetagem() {

	}

	def calcularVotosQuantidade() {
		
	}
	
}