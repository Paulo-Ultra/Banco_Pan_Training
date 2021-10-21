import java.util.ArrayList;
import java.util.HashMap;

public class AquecimentoListaArray {

	public static void main(String[] args) {
		
		//Chave valor que mapeia, como se fosse um indice
		//       Chave,  valor
		HashMap<String, String>  hashMapinho = new HashMap<>();
		//                chave,      valor
		hashMapinho.put("procuro", "fui achado hash");
		hashMapinho.put("procuro2", "fui achado hash 2");
		
		String value = hashMapinho.get("procuro");// pega pela chave, muito usado em banco noSQL
		System.out.println(value);
		
		
		
		//---------------------------------------------------------------------
		
		ArrayList<String> lista = new ArrayList<>();
		lista.add("topico 1 da lista me achou");
		lista.add("topico 2 da lista me achou");
		
		String str1 = lista.get(0); // str1 receberá "St e pega pela posição do array no caso "0"
		System.out.println(str1);
	}

}
