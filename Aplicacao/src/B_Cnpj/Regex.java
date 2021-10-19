package B_Cnpj;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
	public static String adicionarMascara (String cnpj) {
		Pattern pattern = Pattern.compile("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})");
											// $1  .    $2  .  $3  /   $4   -   $5
		Matcher matcher = pattern.matcher(cnpj);
		if(cnpj.length()!= 14) {
			System.out.println("Não tem 14 digitos");
			return cnpj;
		}
		else {
			return matcher.replaceAll("$1.$2.$3/$4-$5");
		}
	}
}
