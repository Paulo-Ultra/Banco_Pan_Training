package com.encapsulamento;

public class Teste {
	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		
		f.nome = "Rafael Cosentino";
		f.salario = 2000;
		
		System.out.println(f.nome);
		System.out.println(f.salario);
	}

}
