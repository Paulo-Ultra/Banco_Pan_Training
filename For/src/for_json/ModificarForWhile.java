package for_json;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ModificarForWhile {

	public static void main(String[] args) {

		//FOR util se conhece o tamanho do array
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			
		}
		//Exercicio: Use um forloop para imprimir "consegui" 5 vezes e o n�mero da tentativa na frente
		for (int i = 1; i <=5 ; i++) {
			System.out.println("Consegui " + i + "� tentativa");
			
		}
		System.out.println();
		//while para quando queremos
		String example = "2021.10.10";
		Pattern pattern = Pattern.compile("(\\d{4})[.](\\d{2})[.](\\d{2})");
		Matcher matcher = pattern.matcher(example);
		//verifies full match
		
		while (matcher.find()) {
			System.out.println(matcher.group());
			
		}
	
		//while pegando so numeros
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("hello1234goodboy789very2345");
		while (m.find()) {
			System.out.println(m.group());
		}
	
		System.out.println();
		String text = "John speak  and John writes about that,\"\r\n"
				+ "				+ \" and John think 2021.10.10 about everything.\r\n"
				+ "";
		
		String nominho = "(John)";
		
		Pattern patternNominho = Pattern.compile(nominho);
		
		Matcher matcherNominho = patternNominho.matcher(text);
		
		while (matcherNominho.find()) {
			System.out.println("found: " + matcherNominho.group());
		}
		
		
	}

}
