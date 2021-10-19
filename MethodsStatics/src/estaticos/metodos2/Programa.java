package estaticos.metodos2;

public class Programa {

	public static void main(String[] args) {

		System.out.println(Produto.resultado(10, 50));
		
		Produto produtinho = new Produto();
		System.out.println(produtinho.mudeNomeProduto("João"));
		System.out.println(Produto.pegarCPF("      999.148.265-78"));
	}

}
