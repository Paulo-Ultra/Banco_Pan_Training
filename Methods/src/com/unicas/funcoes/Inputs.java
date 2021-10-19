package com.unicas.funcoes;

import javax.swing.JOptionPane;

public class Inputs {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome? ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é a sua idade? "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu peso? "));
				
		JOptionPane.showConfirmDialog(null, "O nome é: [" + nome + "] Tem certeza?");
		JOptionPane.showMessageDialog(null, "A idade é: " + idade);
		JOptionPane.showMessageDialog(null, "O peso é: " + peso);
		
		//System.out.println("O nome é: " + nome);
		//System.out.println("A idade é: "+ idade);
		//System.out.println("O peso é: " + peso);
	
	}
}
