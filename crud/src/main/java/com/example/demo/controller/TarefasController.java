package com.example.demo.controller;


import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TarefasModel;
import com.example.demo.repository.TarefasRepository;

@RestController
@RequestMapping("/api")
public class TarefasController {
	
	Calendar c1 = Calendar.getInstance();
	int hora = c1.get(Calendar.HOUR_OF_DAY);

	@Autowired
	private TarefasRepository tarefasRepository;

	@GetMapping("/listar/tarefas")
	public List<TarefasModel> findAll() {
		return tarefasRepository.findAll();
	}

	@GetMapping(value = "/listar/tarefas/condicional")
	public ResponseEntity<List<TarefasModel>> getAll() {
		if (hora > 9 && hora < 17) {
			System.out.println("entrou, dentro do horario");
			return ResponseEntity.ok(tarefasRepository.findAll());
		} else {

			System.out.println("fora do horario");
			return ResponseEntity.noContent().build();
		}
	}
		@PostMapping("salvar/tarefas")
		public ResponseEntity<TarefasModel> post(@RequestBody TarefasModel tarefinha){
			return ResponseEntity.status(HttpStatus.CREATED).body(tarefasRepository.save(tarefinha));
		}

		@GetMapping("listar/tarefas/{id}")
		public ResponseEntity<TarefasModel> GetById(@PathVariable Long id){
			return tarefasRepository.findById(id)
					.map(resp -> ResponseEntity.ok(resp))
					.orElse(ResponseEntity.notFound().build());
			}

		
	@GetMapping("listar/tarefa/{tarefa}")
	public ResponseEntity <List<TarefasModel>> GetByTarefa(@PathVariable String tarefa){
		return ResponseEntity.ok(tarefasRepository.findAllByTarefaContainingIgnoreCase(tarefa));
	}
	
	@GetMapping("listar/tarefa/{tarefa}/{id}")
	public ResponseEntity <List<TarefasModel>> timeTimao(@PathVariable String tarefa, @PathVariable Long id){
		return ResponseEntity.ok(tarefasRepository.findByTarefaAndId(tarefa, id));
	}
	
	@PutMapping ("/atualizar/tab/{id}")
	public TarefasModel atualizar(@PathVariable Long id, @RequestBody TarefasModel model) {
		model.setId(id);
		tarefasRepository.save(model);
		return model;
	}
}
