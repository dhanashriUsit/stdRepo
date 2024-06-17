package com.example.demoProject.employee;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Employee1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
	@JsonManagedReference
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Address1> addresses;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address1> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address1> addresses) {
		this.addresses = addresses;
	}

	public Employee1(Long id, String name, List<Address1> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.addresses = addresses;
	}

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}