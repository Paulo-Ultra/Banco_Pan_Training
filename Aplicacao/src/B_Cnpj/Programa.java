package B_Cnpj;

public class Programa {

	public static void main(String[] args) {
		System.out.println(Regex.adicionarMascara("1234567890123"));
		//https://www.4devs.com.br/gerador_de_cnpj
		//https://regexlib.com/Search.aspx?k=CPF&c=-1&m=-1&ps=20&AspxAutoDetectCookieSupport=1
		System.out.println(Regex.adicionarMascara("78695904000176"));
	}

}
