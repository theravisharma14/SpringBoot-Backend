package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application2.properties")
public class User {
	
	
	@Value("${user}")
	private String user;
	
	@Value("${password}")
	private String password;
	
	
	@Override
	public String toString() {
		return "User [user=" + user + ", password=" + password + "]";
	}
	
	
}
