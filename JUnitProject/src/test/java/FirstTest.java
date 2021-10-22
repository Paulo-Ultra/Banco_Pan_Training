import org.junit.After;
import org.junit.Test;

public class FirstTest {
	
	//A Anotação @Test deve ser pública e não pode ter retorno
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
	
	//@Test                   //Metodo sem anotação o JUnit ignora e não realiza a ação de testar o método
	public void metodoNaoEUmTeste() {
		System.out.println("Esta Mensagem não deve aparecer");
	}
	
	
	
}
