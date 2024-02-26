package com.example.demoProject.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class StudentController {

	@Autowired
	StudentService st;
	
	@GetMapping("/")
	public String show() {
		System.out.println("......");
		System.out.println("ooooollll777l");
		return st.show();
	}
	
	@GetMapping("/display")
	public String display() {
		return "display API";
	}
}
