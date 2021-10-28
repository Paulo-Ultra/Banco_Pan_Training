package parte2;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	//Construtores devem obrigatoriamente ter o nome da Classe
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//Metodo to String que organiza o codigo, não precisa ser invocado
	public String toString() {
		return name + ", $ " + price + ", " + quantity;
	}
}
