package com.example.demoProject.student;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//@CrossOrigin(origins = "http://localhost:8082")
@RestController
public class StudentController {

	StudentService st=new StudentService();
	
	@GetMapping("show")
	public String show() {
		System.out.println("......");
		System.out.println("ooooolllll");
		return st.show();
	}
	
	@GetMapping("/display")
	public String display() {
		return "display API";
	}
}
