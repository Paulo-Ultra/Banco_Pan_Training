package br.com.pacote;

public class Pessoa {

	//cria a variável nome
	private String name = "Paulo Ricardo";
	
	//metodo pegar nome passa parâmetro interno
	private String pegarNome(String visitanteNome) {
		//
		System.out.println("Quem é??... " + visitanteNome);
		return name;
	}
}
