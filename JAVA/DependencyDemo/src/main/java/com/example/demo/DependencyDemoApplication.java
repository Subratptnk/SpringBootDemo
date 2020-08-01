package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;		// return an object in time of execution

@SpringBootApplication
public class DependencyDemoApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(DependencyDemoApplication.class, args);
	
	Customer c = context.getBean(Customer.class);	// tring to tell the compiler to return an object of customer class
	c.display();
	}
	
}
