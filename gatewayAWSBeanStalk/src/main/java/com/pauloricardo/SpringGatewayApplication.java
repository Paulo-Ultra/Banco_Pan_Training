package com.pauloricardo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pauloricardo.gateway.model.Book;

@RestController
@SpringBootApplication
@RequestMapping("/book")
public class SpringGatewayApplication {
	
	private final List<Book> books = new ArrayList<>();
	
	@PostMapping
	public Book addBook(@RequestBody Book book) {
		books.add(book);
		return book;
	}

	@GetMapping
	public List<Book> getBooks(){
		return books;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringGatewayApplication.class, args);
	}

}
