package parte1;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	//Metodo to String que organiza o codigo, n�o precisa ser invocado
	public String toString() {
		return name + ", $ " + price + ", " + quantity;
	}
}
