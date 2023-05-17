package com.example.springdummyapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SpringDummyAppApplication {

	@GetMapping("/message")
	public String message(){
		return "Congrats ! Your app deployed successfully in Azure!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDummyAppApplication.class, args);
	}

}
