import org.junit.After;
import org.junit.Test;

public class FirstTest {
	
	//A Anota��o @Test deve ser p�blica e n�o pode ter retorno
	@Test
	public void primeiroMetodoDeExemploDeTesteValido () {
		
	}
	
	//@Test
	public String metodoExemploDeTesteInvalidoReturnString() {
		return "";
	}
	
	//@Test
	public String metodoExemploDeTesteInvalidoTipoPrivate() {
		return "";
	}

	//@Test
	protected void metodoExemploDeTesteInvalidoTipoProtected() {
		
	}
	
	@After
	public void metodoDeExemploDeTesteImpressaoNaTela() {
		System.out.println("Teste 1 executado");

	}
	
	@Test
	public void metodoDeExemploDeTesteImpressaoNaTelaDois() {
		System.out.println("Teste 2 executado");
	}
	
	//@Test                   //Metodo sem anota��o o JUnit ignora e n�o realiza a a��o de testar o m�todo
	public void metodoNaoEUmTeste() {
		System.out.println("Esta Mensagem n�o deve aparecer");
	}
	
	
	
}
