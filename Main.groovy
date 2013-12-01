class Main {
	def static main(args) {	
		inicio()
	}

	def static inicio() {
		System.in.withReader {
			println "Bem-vindo a Urna Eletrônica do IFRN! Digite a sua opção:"
			println "1 - Cadastro de Candidatos"
			println "2 - Iniciar Votação"
			println "3 - Contar resultados"
			println "4 - Sair"
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
			case 3:
				ContaResultado.calcular()
				break
			case 4:
				println "Tchau!"
				System.exit(0)
			default:
				inicio()
				break
		}
	}
}