
public class Vetor {

	public static void main(String[] args) {
		int[] vetor = new int[5];
		int i;
		int somaElementos = 0;
		int menor = 0;
		int maior = 0;
		try {
		for (i = 0; i < 5; i++) {
		vetor[i] = (int) (Math.random() * 100);
		somaElementos = vetor[i] + somaElementos;
		System.out.print(vetor[i] + " ");
		}
		System.out.println();
		menor = vetor[4];
		maior = vetor[0];
		for (i = 0; i < 5; i++) {
		if (vetor[i] < menor)
		menor = vetor[i];
		}
		for (i = 0; i < 5; i++) {
		if (vetor[i] > maior)
		maior = vetor[i];
		}
		System.out.println("MENOR \n" + menor);
		System.out.println("MAIOR \n" + maior);
		System.out.println("SOMA \n" + somaElementos);
		System.out.println("ULTIMA POSICAO \n" + vetor[4]);
		System.out.println("PRIMEIRA POSICAO \n" + vetor[0]);
	} catch (Exception e) {
		System.out.println("ERRO");
	}
}


}


