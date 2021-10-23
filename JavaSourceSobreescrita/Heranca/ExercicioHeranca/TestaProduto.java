package ExercicioHeranca;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class TestaProduto {

	public static void main(String[] args) {

		Livro livro1 = new Livro();
		livro1.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Qual o codigo do produto?")));
		livro1.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Qual o preço do produto?")));
		livro1.setDescricao(JOptionPane.showInputDialog("Qual a descrição do produto?"));
		
		livro1.exibirDados();
		
	}

}
