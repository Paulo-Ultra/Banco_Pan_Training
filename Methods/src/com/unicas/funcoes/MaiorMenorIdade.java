package com.unicas.funcoes;

import javax.swing.JOptionPane;

public class MaiorMenorIdade {

	public static void main(String[] args) {
		// obtendo a idade do usuario
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));
		
		if(idade < 18) {
			System.out.println("Menor de idade!");
			System.out.println("Ano que vem será maior!");
			JOptionPane.showMessageDialog(null, "Menor");
		}
		else {
			System.out.println("Maior!");
			JOptionPane.showMessageDialog(null, "Maior");
		}

	}

}
