
public class App {

	public static void main(String[] args) {

		Atleta atleta1 = new Atleta();
		atleta1.setValorPatrocinio(1000);
		Corredor corredor1 = new Corredor();
		corredor1.setValorPatrocinio(1000);
		
		int taxa = 15;
		atleta1.atualizarValor(taxa);
		corredor1.atualizarValor(taxa);
		
		System.out.println("Novo sal�rio de atleta " + atleta1.getValorPatrocinio());
		System.out.println("Novo sal�rio de corredor " + corredor1.getValorPatrocinio());
	}

}
