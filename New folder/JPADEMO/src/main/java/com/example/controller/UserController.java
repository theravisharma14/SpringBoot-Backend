package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.record.UserRecord;
import com.example.service.UserService;
    
@RestController    
public class UserController   
{    
@Autowired    
private UserService userService;     
@GetMapping("/")    
public List<UserRecord> getAllUser()  
{    
return userService.getAllUsers();    
}       
@RequestMapping("/adduser")    
public UserRecord addUser(@RequestBody UserRecord userRecord)  
{    
return userService.addUser(userRecord);    
}       
}    