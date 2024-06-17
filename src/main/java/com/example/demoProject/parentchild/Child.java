package com.example.demoProject.parentchild;

import com.example.demoProject.college.University;
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
@Table(name="Child")
public class Child {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	private String cName;
	private long value;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pId")
	@JsonBackReference
	private Parent parent;

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

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public Child(int cId, String cName, long value, Parent parent) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.value = value;
		this.parent = parent;
	}

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
