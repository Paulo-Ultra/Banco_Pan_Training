import java.util.Stack;

public class Pilhas1 {

	public static void main(String[] args) {

		Stack<Integer> pilha = new Stack<>(); //Muito usado para estoque
		
		boolean result = pilha.empty();
							//	
		System.out.println("A pilha est� vazia?? " + result);
		//A ultima coisa colocada � a primeira a ser tirada - Last In First Out - LIFO
		pilha.push(68);
		pilha.push(118);
		pilha.push(90);
		pilha.push(720);
		
		//deleta o �ltimo
		pilha.pop();

		System.out.println("Elementos do meu stack: " + pilha);
		result = pilha.empty();
		System.out.println("Est� vazio?? " + result);
		
	}

}
