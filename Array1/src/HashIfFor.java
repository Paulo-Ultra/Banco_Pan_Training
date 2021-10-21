import java.util.HashMap;

public class HashIfFor {

	public static void main(String[] args) {

		HashMap<String, String> capitais = new HashMap<String, String>();
		capitais.put("Inglaterra", "Londres");
		capitais.put("Alemanha", "Berlim");
		capitais.put("Brasil", "Brasília");
		
		for (String i : capitais.keySet()) {
			if (i != "Inglaterra") {
				System.out.println(i);
			}	
		}
	}

}
