package com.example.demoProject.college;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="college")
public class College {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	private String cName;
	private String cAdd;
	
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="uId")
	private University university;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAdd() {
		return cAdd;
	}

	public void setcAdd(String cAdd) {
		this.cAdd = cAdd;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public College(int cId, String cName, String cAdd, University university) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cAdd = cAdd;
		this.university = university;
	}

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
