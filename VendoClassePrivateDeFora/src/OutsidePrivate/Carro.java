package OutsidePrivate;

public class Carro {
	//atributo nime
	private String nome;
	//método sem retorno
	private void exibeVelocidade () {
		System.out.println("A velocidade de uma "+nome+" é de 380km");
	}
	//getters and setters início
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//getters and setters fim
	
	//Este método vai divulgar------------------------------------------
	public String getName() {
		return this.nome;
	}
	
}

