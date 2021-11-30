package com.pauloricardo.controller;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	public String hello(@RequestParam(name = "nome", defaultValue = "World") String nome) {
		return String.format("Hello, %s", nome);
	}
}
