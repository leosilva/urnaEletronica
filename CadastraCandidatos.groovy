class CadastraCandidatos {
	def static mapaCandidatos = [:]
	def static cadastrar() {
		System.in.withReader {
			println "Digite o número do candidato: "
			def numero = it.readLine() as Integer
			println "Digite o nome do candidato: "
			def nome = it.readLine()
			mapaCandidatos[numero] = nome
		}
	}
}