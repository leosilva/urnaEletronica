class CadastraCandidatos {
	def static mapaCandidatos = [:]
	def static cadastrar() {
		def op= 1	
		System.in.withReader {
			while(op==1) {
				println "Digite o número do candidato: "
				def numero = it.readLine() as Integer
				println "Digite o nome do candidato: "
				def nome = it.readLine()
				mapaCandidatos[numero] = nome
				throw new NullPointerException()
				println("Cadastrar novo Candidato? 1- Sim 2- Não")
				op = it.readLine() as Integer
			}			
			Runtime run = Runtime.getRuntime();
			run.exec("clear")
			Main.inicio()
		}
	}
}