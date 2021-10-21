package com.demo;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	
	private static Map<String, Produto> produtoRepository = new HashMap<>();
	static {
		//Mocka um produto chocolate
		Produto chocolate = new Produto();
		chocolate.setId("1");
		chocolate.setNome("Chocolate");
		produtoRepository.put(chocolate.getId(), chocolate);
		
		//mocka um produto trufa
		Produto trufa = new Produto();
		trufa.setId("2");
		trufa.setNome("Trufa");
		produtoRepository.put(trufa.getId(), trufa);
	}
	
	//salva
	@Override
	public void createProduto(Produto produto) {
		produtoRepository.put(produto.getId(), produto);
	}
	
	//deleta
	@Override
	public void deleteProduto(String id) {
		produtoRepository.remove(id);
	}
	
	@Override
	public Collection<Produto> getProduto(){
		return produtoRepository.values();
	}

}
