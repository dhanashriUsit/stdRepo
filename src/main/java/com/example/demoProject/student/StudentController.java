package com.example.demoProject.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class StudentController {

	@Autowired
	StudentService st;
	
	
	 @PostMapping("/add")
	    public Student addStudent(@RequestBody Student student) {
	        return st.addStudent(student);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteStudent(@PathVariable int id) {
	        st.deleteStudent(id);
	    }

	    @GetMapping("/all")
	    public List<Student> getAllStudents() {
	        return st.getAllStudents();
	    }
	
	  @GetMapping("/display")
	  public String display() {
		return "display API";
	  }
}
