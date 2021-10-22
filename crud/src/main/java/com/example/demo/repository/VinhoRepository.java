package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Vinho;

public interface VinhoRepository extends JpaRepository<Vinho, Long> {
	

}
