package com.example.demoProject.task;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ErrorController {

	@Autowired
	ErrorService eService;
	
	@Autowired
	ErrorDetailsRepository drepo;
	
	
	@Autowired
	ErrorRepository error;
	
	@GetMapping("errorcode")
	public List<ErrorCode> getAllErrorCodes(){
		return eService.getAllErrorCodes();
	}
	
	@GetMapping("errordetails")
	public List<ErrorCodeDetail> getAllErrorCodeDetails(){
		return eService.getAllErrorCodeDetails();
	}
	
	 
	 @GetMapping("detail/{codeId}")
	    public List<ErrorCodeDetail> getErrorCodeDetailsByCodeId(@PathVariable int codeId) {
	        return eService.getAllErrorCodeDetailsByCodeId(codeId);
	    }
	 
	 @PutMapping("/errorcode/color/{codeId}/{colorCode}")
	 public ResponseEntity<?> updateErrorCodeColor(@PathVariable int codeId, @PathVariable String colorCode) {
	     String n="#".concat(colorCode);
		 System.out.println(codeId + " " + n);
	     eService.updateErrorCodeColor(codeId, n);
		 System.out.println(codeId + " " + colorCode);

	     return ResponseEntity.ok().build();
	 }
	 
	 @PutMapping("/error/update/{codeId}")
	    public ResponseEntity<?> updateErrorCodeAndDetails(@PathVariable int codeId, @RequestBody ErrorCodeUpdateRequest request) {
	        eService.updateErrorCodeAndDetails(codeId, request.getCodeName(), request.getCodeDesc(), request.getColorCode(), request.getErrorCodeDetails());
	        return ResponseEntity.ok().build();
	    }
	 
//	 @PutMapping("/errordetail/update/{detailId}")
//	 public ResponseEntity<?> updateErrorCodeDetail(@PathVariable int detailId, @RequestBody Map<String, String> requestBody) {
//	     String description = requestBody.get("description");
//	     eService.updateErrorCodeDetail(detailId, description);
//	     return ResponseEntity.ok().build();
//	 }
	 
	 @DeleteMapping("/error/{codeId}")
	    public ResponseEntity<?> deleteErrorCode(@PathVariable int codeId) {
		 eService.deleteErrorCode(codeId);
	        return ResponseEntity.ok().build();
	    }
	 
	 @PostMapping("/errorcode")
	    public ResponseEntity<?> addErrorCode(@RequestBody ErrorCode errorCode) {
	        try {
	            eService.addErrorCode(errorCode); 
	            return new ResponseEntity<>("New ErrorCode added successfully", HttpStatus.CREATED);
	        } catch (Exception e) {
	            return new ResponseEntity<>("Failed to add new ErrorCode", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }

	 @PutMapping("/errordetail/{detailId}")
	    public ResponseEntity<?> updateErrorCodeDetail(@PathVariable int detailId, @RequestBody Map<String, String> requestBody) {
	        String description = requestBody.get("description");
	        try {
	            eService.updateErrorCodeDetail(detailId, description);
	            return ResponseEntity.ok().build();
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update ErrorCodeDetail");
	        }
	    }

	    @DeleteMapping("/errordetail/{detailId}")
	    public ResponseEntity<?> deleteErrorCodeDetail(@PathVariable int detailId) {
	        try {
	            eService.deleteErrorCodeDetail(detailId);
	            return ResponseEntity.ok().build();
	        } catch (Exception e) {
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to delete ErrorCodeDetail");
	        }
	    }
	    
	    
	    @PostMapping("/errordetail")
	    public ResponseEntity<?> addErrorCodeDetail(@RequestBody ErrorCodeDetailRequest request) {
	        try {
	            eService.addErrorCodeDetail(request);
	            return new ResponseEntity<>("New ErrorCodeDetail added successfully", HttpStatus.CREATED);
	        } catch (Exception e) {
	            return new ResponseEntity<>("Failed to add new ErrorCodeDetail", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	    
	    @PostMapping("/detail/{codeId}")
	    public ResponseEntity<?> addErrorCodeDetailByCodeId(@PathVariable int codeId, @RequestBody Map<String, String> requestBody) {
	        String description = requestBody.get("description");
	        try {
	            eService.addErrorCodeDetailByCodeId(codeId, description);
	            return new ResponseEntity<>("New ErrorCodeDetail added successfully", HttpStatus.CREATED);
	        } catch (Exception e) {
	            return new ResponseEntity<>("Failed to add new ErrorCodeDetail", HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }


	    
	   }
