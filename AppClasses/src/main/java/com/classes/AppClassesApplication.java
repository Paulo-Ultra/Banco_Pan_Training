package com.classes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.classes.tabelas.Produtos;

@SpringBootApplication


public class AppClassesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppClassesApplication.class, args);
		
		Produtos produto1 = new Produtos();
		produto1.setDescricao("Luva");
		produto1.setValor(20.5);
		
		System.out.println(produto1);
		System.out.println(produto1.getDescricao());
		System.out.println(produto1.getValor());
	}

}
