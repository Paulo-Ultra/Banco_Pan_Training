package com.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ProdutoController {
	
	//http://localhost:8089/swagger-ui.html#/produto-controller/createProdutoUsingPOST
	ProdutoService produtoService;
	
		@GetMapping(value = "/listar")
		public ResponseEntity<Object> getProduto(){
			return new ResponseEntity<>(produtoService.getProduto(), HttpStatus.OK);
			}
		
		@DeleteMapping("/deletar")
		public ResponseEntity<Object> delete(@PathVariable("id") String id) {
			produtoService.deleteProduto(id);
			return new ResponseEntity<>("Prod deletado com sucesso", HttpStatus.OK);
		}
		@PostMapping("/produtos")
		public ResponseEntity<Object> createProduto(@RequestBody Produto produto) {
			produtoService.createProduto(produto);
			return new ResponseEntity<>("Prod Criado", HttpStatus.CREATED);
		}
}
