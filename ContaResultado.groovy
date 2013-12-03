class ContaResultado {
	def static mapaPorcentagem = [:]
	def contarResultadoEmPorcentagem(){
		
		def contagem = 0
		Votacao.mapaVotacao.each{
			contagem += mapaVotacao[it]
		}
		
		Votacao.mapaVotacao.each{chave, valor ->
			mapaPorcentagem[chave] = (valor*100)/contagem
		}
	}
}