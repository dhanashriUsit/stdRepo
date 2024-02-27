package com.example.demoProject.student;

import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sName;
	private String sAdd;
	private String sNo;
	private String school;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAdd() {
		return sAdd;
	}
	public void setsAdd(String sAdd) {
		this.sAdd = sAdd;
	}
	public String getsNo() {
		return sNo;
	}
	public void setsNo(String sNo) {
		this.sNo = sNo;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public Student(int sid, String sName, String sAdd, String sNo, String school) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.sAdd = sAdd;
		this.sNo = sNo;
		this.school = school;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sName=" + sName + ", sAdd=" + sAdd + ", sNo=" + sNo + ", school=" + school
				+ "]";
	}
	
	

}
