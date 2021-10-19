package listas;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List lista = new ArrayList();
		lista.add(77);
		lista.add("Julio Freitas");
		lista.add(3003.32);
		lista.add(80);
		//lista.remove(2);
		
		System.out.println("Lista com elementos diferentes " + lista);
		System.out.println("Lista com nome " + lista.get(1));
		System.out.println("Lista com salário: R$" +  lista.get(2));
		lista.clear();
		System.out.println("Lista esvaziada: " + lista);

	}

}
