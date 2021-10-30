package com.pauloricardo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class PessoaModel {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="O CPF deve ser preenchido")
	private String cpf;
	
	@NotEmpty(message="O nome deve ser preenchido")
	private String nome;
	
	@NotEmpty(message="O E-mail deve ser preenchido")
	private String email;
	
	@NotEmpty(message="A idade deve ser preenchida")
	private int idade;
	
	public PessoaModel() {}

	public PessoaModel(String cpf, String nome,  String email, int idade) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
