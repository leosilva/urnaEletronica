class Votacao {

	static def mapaVotacao = [:]

	static def iniciar() {
		println "Iniciando a votação..."
		CadastraCandidatos.mapaCandidatos.keySet().each {
			mapaVotacao[it] = 0
		}
		println """
		Instruções: 
			- Digite o número do candidato a ser votado;
			- Para encerrar a votação, digite 0.
		Votação em andamento..."""
		realizarVotacao()
	}

	static def realizarVotacao() {
		System.in.withReader {
			println "Digite o número do candidato: "
			def numeroDigitado = it.readLine() as Integer
			if (!numeroDigitado) {
				println "Votação encerrada!"
				Main.inicio()
			} else if (!mapaVotacao.keySet().contains(numeroDigitado)) {
				println "Candidato inexistente!"
				realizarVotacao()
			} else {
			mapaVotacao[numeroDigitado] = mapaVotacao[numeroDigitado] + 1
			println "Voto computado com sucesso!"
			realizarVotacao()
			}
		}
	}
		
}