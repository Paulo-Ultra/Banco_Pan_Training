package externo;

import interno.Produto;

public class TestePacoteExterno {

	public static void main(String[] args) {

		Produto prodLuva = new Produto();
		prodLuva.nomeProd = "Luva";
		System.out.println(prodLuva.getNomeProd());
		
	}

}
