package com.pauloricardo.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pauloricardo.security.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
