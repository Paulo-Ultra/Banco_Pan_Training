import java.util.ArrayList;

public class ArrayFor {

	public static void main(String[] args) {

		ArrayList<String> pessoas = new ArrayList();
		
		///List<String> pessoas = new ArrayList();
		
		pessoas.add("Luiza");
		pessoas.add("Gabriel");
		pessoas.add("Marcio");
		
		System.out.println("----------Todas Pessoas-----------");
		for (String pessoinha: pessoas) {
			System.out.printf("Posição %s\n", pessoinha);
		}
	
	System.out.println("-----------começa com L-----------");
	for (String pessoinha: pessoas) {
		if(pessoinha.charAt(0) == 'L') {
			System.out.printf("Posição %s\n", pessoinha);
	}  
		}
	
	System.out.println("---------Pessoas e indices----------");
	System.out.println("Indo um por um");
	int i = 0;
	for (String pessoinha: pessoas) {
		System.out.printf("Posição %d - %s\n", i, pessoinha);
		i++;
	}
		
	}}
		


