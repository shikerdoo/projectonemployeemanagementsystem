package com.Prograd.SpringDemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoHelloWorldApplication.class, args);
		System.out.println("Hello World");
	}

}
