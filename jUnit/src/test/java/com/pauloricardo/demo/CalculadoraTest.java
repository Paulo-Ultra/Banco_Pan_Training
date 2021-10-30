package com.pauloricardo.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void testSomar() {
		System.out.println("somar");
		int n1 = 5;
		int n2 = 5;
		
		Calculadora calculadorinhaTeste = new Calculadora();
		double resultadoEsperado = 10.0;
		double result = calculadorinhaTeste.aumentar(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}

	@Test
	public void testDiminuir() {
		System.out.println("subtrair");
		int n1 = 5;
		int n2 = 3;
		
		Calculadora calculadorinhaTeste = new Calculadora();
		double resultadoEsperado = 3.0;
		double result = calculadorinhaTeste.diminuir(n1, n2);
		assertEquals(resultadoEsperado, result, "Erro subtração");
	}
	
	@Test
	public void testMultiplicar() {
		System.out.println("multiplicar");
		int n1 = 5;
		int n2 = 3;
		
		Calculadora calculadorinhaTeste = new Calculadora();
		double resultadoEsperado = 15.0;
		double result = calculadorinhaTeste.multiplicar(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}
	
	@Test
	public void testDividir() {
		System.out.println("dividir");
		int n1 = 6;
		int n2 = 3;
		
		Calculadora calculadorinhaTeste = new Calculadora();
		double resultadoEsperado = 2.0;
		double result = calculadorinhaTeste.dividir(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}

	@Test
	public void testResto() {
		System.out.println("resto");
		int n1 = 6;
		int n2 = 3;
		
		Calculadora calculadorinhaTeste = new Calculadora();
		double resultadoEsperado = 0.0;
		double result = calculadorinhaTeste.resto(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}
	
}
