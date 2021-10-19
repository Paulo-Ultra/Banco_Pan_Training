package com.heranca;

public class ProgramaFuncionarios {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setUsuario("rafael cosentino");
		g.setSenha("12345");
		g.setNome("Rafael Cosetino");
		g.setSalario(2000);

		Telefonista t = new Telefonista();
		t.setEstacaoDeTrabalho(13);
		t.setNome("Carolina Mello");
		t.setSalario(1000);
		
		Secretaria s = new Secretaria();
		s.setRamal(1598);
		s.setNome("Tatiane Andrade");
		s.setSalario(1500);
		
		System.out.println("GERENTE");
		System.out.println("Nome: "+ g.getNome());
		System.out.println("Salário: "+ g.getSalario());
		System.out.println("Usuário: "+ g.getUsuario());
		System.out.println("Senha: "+ g.getSenha());
		System.out.println();

		System.out.println("TELEFONISTA");
		System.out.println("Nome: "+ t.getNome());
		System.out.println("Estação de Trabalho: " + t.getEstacaoDeTrabalho());
		System.out.println("\"Salário: "+ t.getSalario());
		System.out.println();

		System.out.println("SECRETARIA");
		System.out.println("Nome: "+ s.getNome());
		System.out.println("Ramal: "+ s.getRamal());
		System.out.println("Salario: "+ s.getSalario());		
	}
	

}
