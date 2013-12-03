class VerificarSegundoTurno {
	def segundoTurno = true
	def mapaSegundTurno = [:]
	def verificarSegundoTurno(){
		ContaResultado.mapaPorcentagem.each{chave,valor ->
			if (valor > 50){
				segundoTurno = false
			}
		}

		if (segundoTurno) {

			def mapaChaves = (CadastraCandidatos.mapaCandidatos.sort{
				it.value
			}).keySet()
			mapaSegundTurno[mapaChaves[0]] = CadastraCandidatos.mapaCandidatos[mapaChaves[0]]
			mapaSegundTurno[mapaChaves[1]] = CadastraCandidatos.mapaCandidatos[mapaChaves[1]]
			CadastraCandidatos.mapaCandidatos = mapaSegundTurno

			Votacao.iniciar()
		}
	}
}