package OutsidePrivate;

public class Carro {
	//atributo nime
	private String nome;
	//m�todo sem retorno
	private void exibeVelocidade () {
		System.out.println("A velocidade de uma "+nome+" � de 380km");
	}
	//getters and setters in�cio
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//getters and setters fim
	
	//Este m�todo vai divulgar------------------------------------------
	public String getName() {
		return this.nome;
	}
	
}

