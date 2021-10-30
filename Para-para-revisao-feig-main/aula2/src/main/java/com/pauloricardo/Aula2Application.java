package com.pauloricardo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Aula2Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula2Application.class, args);
	}

}
