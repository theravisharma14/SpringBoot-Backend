package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.user.User;

@SpringBootApplication
public class ThirdApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext a=SpringApplication.run(ThirdApp1Application.class, args);
		
		User u=a.getBean(User.class);
	  System.out.println(u.toString());
		
		
	}

}
