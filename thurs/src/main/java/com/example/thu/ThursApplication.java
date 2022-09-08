package com.example.thu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ThursApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(ThursApplication.class, args);
		Technologies c=context.getBean(Technologies.class);
		customers c1=context.getBean(customers.class);
		c.good();
		c1.name();
	}

}
