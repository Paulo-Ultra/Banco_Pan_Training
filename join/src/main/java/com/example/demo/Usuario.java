package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Usuario {
	@Id
	private String login;
	private String nomeCompleto;
	private String senha;
	@ManyToMany
	@JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name= "usuario_id", referencedColumnName = "login"), // 1 Tabela
	inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "nomeRole")) // 2 Tabela
	private List<Role> roles;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
}
