package com.example.demo.address;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@Component
@Service
public class Address {

	@Value("Etah")
	private String address;

	@Override
	public String toString() {
		return "Address [address=" + address + "]";
	}
	

	
	
}
