package com.pauloricardo.security.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
//@Table(name = "product")
public class Product {
	
	//@Column(name = "id_product")
	private Long id;
	private String nome;
	private String marca;
	private String fabricacao;
	private float preco;
	
	public Product() {
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public String getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(String fabricacao) {
		this.fabricacao = fabricacao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	
		
}
