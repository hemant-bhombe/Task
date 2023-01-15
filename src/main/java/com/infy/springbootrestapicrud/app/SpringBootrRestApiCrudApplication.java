package com.infy.springbootrestapicrud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infy.springbootrestapicrud.app.model.Product;

@SpringBootApplication
public class SpringBootrRestApiCrudApplication {

	public static void main(String[] args) {
		System.out.println("Spring Boot Rest API Crud");
		SpringApplication.run(SpringBootrRestApiCrudApplication.class, args);

		
	}

}
