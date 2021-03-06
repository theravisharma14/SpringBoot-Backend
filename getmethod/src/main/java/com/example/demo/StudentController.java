package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student getStudent()
	{
		return new Student("Ravi", "Sharma");
	}
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		List<Student> stu=new ArrayList<>();
		
		stu.add(new Student("Ravi", "Sharma"));
		stu.add(new Student("Pawan", "Rathore"));
		stu.add(new Student("Ayush", "Singh"));
		stu.add(new Student("Vicky", "Thakur"));
		stu.add(new Student("Shiv", "Sharma"));
		
		return stu;
	}
	
	
	//localhost:8080/getStudent/Ravi/Sharma
	@GetMapping("student/{fname}/{lname}")
	public Student pathVAriable(@PathVariable("fname") String  fname,@PathVariable("lname") String lname)
	{
		return new Student(fname,lname);
	}
	
	//get query parameter
	//localhost:8080/getStudent?fname=Ravi&lname=Sharma
	@GetMapping("/getStudent")
	public Student studentQueryParam(@RequestParam(name="fname") String fname,@RequestParam(name="lname") String lname)
	{
		return new Student(fname,lname);
	}

}
