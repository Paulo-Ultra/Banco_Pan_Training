package com.pauloricardo.demo;

public class Calculadora {
	
	private int resultado = 0;
	
	public double aumentar(int n1, int n2) {
		resultado = n1 + n2;
		return resultado;
	}
	
	public double diminuir(int n1, int n2) {
		resultado = n1 - n2;
		return resultado;
	}
	
	public double multiplicar(int n1, int n2) {
		resultado = n1 * n2;
		return resultado;
	}
	
	public double dividir(int n1, int n2) {
		resultado = n1 / n2;
		return resultado;
	}
	
	public double resto (int n1, int n2) {
		resultado = n1 % n2;
		return resultado;
	}
	

}
