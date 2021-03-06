package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bean.User;
import com.spring.service.Iservice;

@RestController
public class MainController {
	
	@Autowired
	Iservice iservice;
	
	
	@GetMapping("/getUser")
	public List<User> getUser()
	{
		return iservice.getUser();
	}
	
	

}
