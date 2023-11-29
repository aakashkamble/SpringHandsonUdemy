package com.example.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class ApIgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApIgatewayApplication.class, args);
	}

}