package br.com.pacote;

public class Pessoa {

	//cria a vari�vel nome
	private String name = "Paulo Ricardo";
	
	//metodo pegar nome passa par�metro interno
	private String pegarNome(String visitanteNome) {
		//
		System.out.println("Quem �??... " + visitanteNome);
		return name;
	}
}
