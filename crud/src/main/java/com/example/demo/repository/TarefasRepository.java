package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.TarefasModel;

public interface TarefasRepository extends JpaRepository<TarefasModel, Long> {

	
	//       Lista tarefa      procura por tabela ignorando case   (tarefa)
	public List<TarefasModel> findAllByTarefaContainingIgnoreCase(String tarefa);
}
