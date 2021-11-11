package com.pauloricardo.security.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pauloricardo.security.models.Product;
import com.pauloricardo.security.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAll(){
		return repo.findAll();
	}

	public void save(Product product) {
		repo.save(product);
	}
	
	public Product get(long id) {
		return repo.findById(id).get();
	}
	
	  public void delete(Long id) {
		    repo.deleteById(id);
		  }
	
}
