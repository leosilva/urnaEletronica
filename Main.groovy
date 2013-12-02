class Main {
	def static main(args) {	
		inicio()
	}

	def static inicio() {
		System.in.withReader {
			println "Bem-vindo a Urna Eletrônica do IFRN! Digite a sua opção:"
			println "1 - Cadastro de Candidatos"
			println "2 - Iniciar Votação"
			println "3 - Contar resultados (quantidade de votos)"
			println "4 - Contar resultados (porcentagem)"
			println "5 - Verificar se haverá segundo turno"
			println "6 - Sair"
			def opcao = it.readLine() as Integer
			verificaOpcao(opcao)
		}
	}


	def static verificaOpcao(opcao) {
		switch(opcao) {
			case 1:
				CadastraCandidatos.cadastrar()
				println CadastraCandidatos.mapaCandidatos
				break
			case 2:
				Votacao.iniciar()
				break
			case 3..4:
				ContaResultado.calcular(opcao)
				break
			case 5:
				VerificarSegundoTurno.verificar()
				break
			case 6:
				println "Tchau!"
				System.exit(0)
			default:
				inicio()
				break
		}
	}
}