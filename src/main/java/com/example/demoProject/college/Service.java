package com.example.demoProject.college;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demoProject.parentchild.Child;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private UniversityRepository urepo;
	
	@Autowired
	private CollegeRepository crepo;
	
	@Autowired
	EntityManager entityManager;
	
	
	
//	public void collegeAdd(College college) {
//		crepo.save(college);
//	}
	
	public void addCollegeToUniversity(int universityId, College college) {
	    University university = urepo.findById(universityId).orElse(null);
	    if (university != null) {
	        college.setUniversity(university);
	        crepo.save(college);
	    } else {
	        
	    }
	}

	
	public void universityAdd(University university) {
		urepo.save(university);
	}
	
	public List<University>getUniversities(){
		return urepo.findAll();
	}
	
	public List<College>getCollege(){
		return crepo.findAll();
	}
	
	public void deleteCollege(int id) {
		crepo.deleteById(id);
	}
	
	public void deleteUniversities(int id) {
		urepo.deleteById(id);
	}
	
}
