package estaticos.atributos;

public class Time {
	//muitos atletas
	//pertence ao objeto	
	String atleta;
	
	
	//um professor
	//pertence a classe
	static String professor;
	
	//atributos comuns não podem ser acessados por métodos estáticos
	static void Treinar() {
		System.out.println(professor);
		System.out.println(atleta);
	}

}
