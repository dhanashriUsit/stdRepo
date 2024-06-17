package com.example.demoProject.task;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ErrorCodeDetail")
public class ErrorCodeDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "codeId", referencedColumnName = "codeId")
    @JsonBackReference
    private ErrorCode errorCode;

    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ErrorCode getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(ErrorCode errorCode) {
		this.errorCode = errorCode;
	}

	public ErrorCodeDetail(int id, String description, ErrorCode errorCode) {
		super();
		this.id = id;
		this.description = description;
		this.errorCode = errorCode;
	}

	public ErrorCodeDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ErrorCodeDetail [id=" + id + ", description=" + description + ", errorCode=" + errorCode + "]";
	}

	
	
    
}
