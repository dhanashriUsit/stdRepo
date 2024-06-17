package com.example.demoProject.parentchild;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Parent")
public class Parent {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	private String pName;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "parent",cascade = CascadeType.ALL)
	private List<Child> childs;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public List<Child> getChilds() {
		return childs;
	}

	public void setChilds(List<Child> childs) {
		this.childs = childs;
	}

	public Parent(int pId, String pName, List<Child> childs) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.childs = childs;
	}

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
