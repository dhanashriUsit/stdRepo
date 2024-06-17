package com.example.demoProject.college;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CacheRetrieveMode;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="university")
public class University {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uId;
	private String uName;
	private String uAdd;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "university",cascade = CascadeType.ALL)
	private List<College> colleges;

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuAdd() {
		return uAdd;
	}

	public void setuAdd(String uAdd) {
		this.uAdd = uAdd;
	}

	public List<College> getColleges() {
		return colleges;
	}

	public void setColleges(List<College> colleges) {
		this.colleges = colleges;
	}

	public University(int uId, String uName, String uAdd, List<College> colleges) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uAdd = uAdd;
		this.colleges = colleges;
	}

	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
