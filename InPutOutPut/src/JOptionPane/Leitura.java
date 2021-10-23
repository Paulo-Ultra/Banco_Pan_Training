package JOptionPane;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Leitura {

	public static void main(String[] args) {
		//Mostrou a mensagem
		JOptionPane.showMessageDialog(null, "Calculando parcelas");
		//Input
		double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do produto?"));
		//Input
		int numParcelas = Integer.parseInt(JOptionPane.showInputDialog("Em quantas parcelas?"));
		//Retorna o valor das parcelas
		double valorParcela = valorTotal / numParcelas;
		NumberFormat formato = new DecimalFormat("R$ ###,###.##");
		JOptionPane.showMessageDialog(null, "O valor de cada parcela é: " + formato.format(valorParcela));
		
	}

}
