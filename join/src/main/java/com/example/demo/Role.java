package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {
	@Id
	private String NomeRole;
	@ManyToMany(mappedBy = "roles")
	private List<Usuario> usuarios;
	
	public String getNomeRole() {
		return NomeRole;
	}
	public void setNomeRole(String nomeRole) {
		NomeRole = nomeRole;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	
}
