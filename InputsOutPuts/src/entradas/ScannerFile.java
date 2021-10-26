package entradas;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ScannerFile {
											//Necessário Colocar a exceção
	public static void main(String[] args) throws IOException {

		String path = "./src/Teste.java";
		File arquivo = new File(path); // ou "./src/arquivo.txt" no lugar do path
		Scanner sc = new Scanner(arquivo);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}

}
