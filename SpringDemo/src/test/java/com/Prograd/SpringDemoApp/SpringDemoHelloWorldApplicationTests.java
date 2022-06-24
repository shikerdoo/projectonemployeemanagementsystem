package com.Prograd.SpringDemoApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDemoHelloWorldApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoHelloWorldApplicationTests.class,args);
		System.out.println("Hello World");
	}

}
