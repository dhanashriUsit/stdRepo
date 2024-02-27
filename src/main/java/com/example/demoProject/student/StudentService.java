package com.example.demoProject.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	StdRepo sr;
	
	
	public String show() {
		return "Hello show method.....,,,";
	}
	
	 public Student addStudent(Student student) {
	        return sr.save(student);
	    }
	 
	 public void deleteStudent(int id) {
	        sr.deleteById(id);
	    }

	    public List<Student> getAllStudents() {
	        return sr.findAll();
	    }
	 
}
