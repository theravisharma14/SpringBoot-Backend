package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bean.Student;

@RestController
public class StudentController {
	
	
	@GetMapping("/students")
	public List<Student> getAll()
	{
		
		List<Student> stu=new ArrayList<Student>();
		
		
		stu.add(new Student(1, "Ravi"));
		stu.add(new Student(2, "Sharma"));
		stu.add(new Student(3, "Pawan"));
		
		
		
		return stu;
	}
	
	

}
