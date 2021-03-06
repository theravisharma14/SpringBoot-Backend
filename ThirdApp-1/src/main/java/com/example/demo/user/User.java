package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.example.demo.address.Address;

@Component
public class User {

@Value("1")	
private int id;


@Value("Ravi")
private String name;

@Autowired
private Address ad;

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", ad=" + ad + "]";
}




	
}
