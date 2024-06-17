package com.example.demoProject.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String street;
    private String city;
    
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee1 employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee1 getEmployee() {
		return employee;
	}

	public void setEmployee(Employee1 employee) {
		this.employee = employee;
	}

	public Address1(Long id, String street, String city, Employee1 employee) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.employee = employee;
	}

	public Address1() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}