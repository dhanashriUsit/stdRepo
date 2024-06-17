package com.example.demoProject.task;

import java.util.List;

public class ErrorCodeUpdateRequest {

	 private String codeName;
	    private String codeDesc;
	    private String colorCode;
	    private List<ErrorCodeDetail> errorCodeDetails;
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
		public String getColorCode() {
			return colorCode;
		}
		public void setColorCode(String colorCode) {
			this.colorCode = colorCode;
		}
		public List<ErrorCodeDetail> getErrorCodeDetails() {
			return errorCodeDetails;
		}
		public void setErrorCodeDetails(List<ErrorCodeDetail> errorCodeDetails) {
			this.errorCodeDetails = errorCodeDetails;
		}
		public ErrorCodeUpdateRequest(String codeName, String codeDesc, String colorCode,
				List<ErrorCodeDetail> errorCodeDetails) {
			super();
			this.codeName = codeName;
			this.codeDesc = codeDesc;
			this.colorCode = colorCode;
			this.errorCodeDetails = errorCodeDetails;
		}
		public ErrorCodeUpdateRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
}
