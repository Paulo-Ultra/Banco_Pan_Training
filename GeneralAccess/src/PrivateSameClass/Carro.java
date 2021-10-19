package PrivateSameClass;

public class Carro {
	
	private String nome;
	private void exibeVelocidade () {
		System.out.println("A velocidade de uma "+nome+" é de 380km");
	}
	public static void main(String[] args) {
		//instancia o objeto
		Carro c = new Carro();
		c.nome = "Ferrari";
		c.exibeVelocidade();
		}

}

