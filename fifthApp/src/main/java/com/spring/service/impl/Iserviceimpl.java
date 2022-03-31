package com.spring.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.bean.User;
import com.spring.service.Iservice;

@Service
public class Iserviceimpl implements Iservice{

	@Override
	public List<User> getUser() {
		List<User> u=new ArrayList<User>();
		u.add(new User(1,"Ravi"));
		u.add(new User(2,"Sharma"));
		u.add(new User(3,"Pawan"));
		
		return u;
	}

}
