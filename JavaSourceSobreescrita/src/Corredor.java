
public class Corredor extends Atleta {
	public double atualizarValor(double taxa) {
		return super.atualizarValor(2*taxa);//a taxa com parâmetro diferente indica o poliformismo, pois usa um parâmetro do atleta de forma diferente
				//o super indica que esta chamando o método
	}
	
}
