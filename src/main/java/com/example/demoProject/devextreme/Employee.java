package com.example.demoProject.devextreme;


@jakarta.persistence.Entity
public class Employee {
    
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String city;
    private String country;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Employee(Long id, String name, int age, String city, String country) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.country = country;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}




}
