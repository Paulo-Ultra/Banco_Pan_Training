
public class Corredor extends Atleta {
	public double atualizarValor(double taxa) {
		return super.atualizarValor(2*taxa);//a taxa com par�metro diferente indica o poliformismo, pois usa um par�metro do atleta de forma diferente
				//o super indica que esta chamando o m�todo
	}
	
}
