package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext a=SpringApplication.run(ApplicationPropertiesApplication.class, args);
		
		User u=a.getBean(User.class);
		System.out.println(u.toString());
	}

}
