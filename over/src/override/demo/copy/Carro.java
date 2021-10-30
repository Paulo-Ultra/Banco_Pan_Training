package override.demo.copy;

public class Carro extends Veiculo{

//	public void iniciar() {
//		System.out.println("Ligando carro");
//	}
	
	//se deixar estes dois metodos, ele escolhe o iniciar
	@Override
	public void iniciarCaminho() {
		System.out.println("Ligando carro");
	}
	
	public void frear(){
		System.out.println("Freando carro");
	}
	
	
}
