package com.jib.springbootjibproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootjibprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjibprojectApplication.class, args);
	}

	@GetMapping(value = "/message")
	public String message(){
		return "Hello Docker";
	}

}
