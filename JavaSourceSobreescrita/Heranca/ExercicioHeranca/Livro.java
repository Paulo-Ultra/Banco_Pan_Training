package ExercicioHeranca;

import javax.swing.JOptionPane;

public class Livro extends Produto {
	public void exibirDados() {
		System.out.println(super.getCodigo());
		System.out.println(super.getPreco());
		System.out.println(super.getDescricao());
		
		JOptionPane.showMessageDialog(null, getCodigo());
		JOptionPane.showMessageDialog(null, getPreco());
		JOptionPane.showMessageDialog(null, getDescricao());
	

	}
}
