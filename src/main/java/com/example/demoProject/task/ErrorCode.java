package com.example.demoProject.task;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "ErrorCode")
public class ErrorCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codeId")
    private int codeId;

    @Column(name = "codeName")
    private String codeName;

    @Column(name = "codeDesc")
    private String codeDesc;

    @Column(name = "colorcode")
    private String colorcode;

    @JsonManagedReference
    @OneToMany(mappedBy = "errorCode", cascade = CascadeType.ALL)
    private List<ErrorCodeDetail> errorCodeDetails;

	public int getCodeId() {
		return codeId;
	}

	public void setCodeId(int codeId) {
		this.codeId = codeId;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	public String getCodeDesc() {
		return codeDesc;
	}

	public void setCodeDesc(String codeDesc) {
		this.codeDesc = codeDesc;
	}

	public String getColorcode() {
		return colorcode;
	}

	public void setColorcode(String colorcode) {
		this.colorcode = colorcode;
	}

	public List<ErrorCodeDetail> getErrorCodeDetails() {
		return errorCodeDetails;
	}

	public void setErrorCodeDetails(List<ErrorCodeDetail> errorCodeDetails) {
		this.errorCodeDetails = errorCodeDetails;
	}

	public ErrorCode(int codeId, String codeName, String codeDesc, String colorcode,
			List<ErrorCodeDetail> errorCodeDetails) {
		super();
		this.codeId = codeId;
		this.codeName = codeName;
		this.codeDesc = codeDesc;
		this.colorcode = colorcode;
		this.errorCodeDetails = errorCodeDetails;
	}

	public ErrorCode() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
	
	
}
