package com.example.demoProject.college;

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
public class Controller {

	@Autowired
	Service service;
	
	@PostMapping("/addcollege/{universityId}")
	public void addCollegeToUniversity(@PathVariable int universityId, @RequestBody College college) {
	    service.addCollegeToUniversity(universityId, college);
	}

	
//	@PostMapping("/addcollege")
//	public void collegeAdd(@RequestBody College college) {
//		service.collegeAdd(college);	
//	}
	
	@PostMapping("/adduniversity")
	public void uniAdd(@RequestBody University university) {
		service.universityAdd(university);
	}
	
	@GetMapping("/alluni")
	public List<University>getUniversities(){
		return service.getUniversities();
	}
	
//	@GetMapping("/allcollege")
//	public List<College>getCollege(){
//		return service.getCollege();
//	}
//	
	@DeleteMapping("deletecollege/{id}")
	public void deleteCollege(@PathVariable int id) {
		service.deleteCollege(id);
	}
	
	
	@DeleteMapping("/deleteuniversities/{id}")
	public void deleteUniversities(@PathVariable int id) {
		service.deleteUniversities(id);
	}
}
