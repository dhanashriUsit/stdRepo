package com.example.demoProject.task;

public class ErrorCodeDetailRequest {

	 private String description;
	    private int codeId;
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public int getCodeId() {
			return codeId;
		}
		public void setCodeId(int codeId) {
			this.codeId = codeId;
		}
		public ErrorCodeDetailRequest(String description, int codeId) {
			super();
			this.description = description;
			this.codeId = codeId;
		}
		public ErrorCodeDetailRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    

}
