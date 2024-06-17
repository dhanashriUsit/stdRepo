package com.example.demoProject.task;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Service
public class ErrorService {

	    @Autowired
	    private EntityManager entityManager;
	    
	    @Autowired
	    ErrorDetailsRepository drepo;

	    @Autowired
	    ErrorRepository erepo;
	    public List<ErrorCode> getAllErrorCodes() {
	        String q = "SELECT e FROM ErrorCode e";
	        TypedQuery<ErrorCode> query = entityManager.createQuery(q, ErrorCode.class);
	        return query.getResultList();
	    }

	    public List<ErrorCodeDetail> getAllErrorCodeDetails() {
	        String q = "SELECT ed FROM ErrorCodeDetail ed";
	        TypedQuery<ErrorCodeDetail> query = entityManager.createQuery(q, ErrorCodeDetail.class);
	        return query.getResultList();
	    }
	
	    public List<ErrorCodeDetail> getAllErrorCodeDetailsByCodeId(int codeId) {
	        String q = "SELECT ed FROM ErrorCodeDetail ed WHERE ed.errorCode.codeId = :codeId";
	        TypedQuery<ErrorCodeDetail> query = entityManager.createQuery(q, ErrorCodeDetail.class);
	        query.setParameter("codeId", codeId);
	        return query.getResultList();
	    }

	    @Transactional
	    public void updateErrorCodeColor(int codeId, String colorCode) {
	        Query query = entityManager.createQuery("UPDATE ErrorCode e SET e.colorcode = :colorCode WHERE e.codeId = :codeId");
	        query.setParameter("colorCode", colorCode);
	        query.setParameter("codeId", codeId);
	        query.executeUpdate();
	    }
	    
	   
	    @Transactional
	    public void updateErrorCodeAndDetails(int codeId, String codeName, String codeDesc, String colorcode, List<ErrorCodeDetail> errorCodeDetails) {
	        ErrorCode errorCode = entityManager.find(ErrorCode.class, codeId);
	        if (errorCode != null) {
	            errorCode.setCodeName(codeName);
	            errorCode.setCodeDesc(codeDesc);
	            errorCode.setColorcode(colorcode);
	            entityManager.merge(errorCode);
	        }

	        for (ErrorCodeDetail errorCodeDetail : errorCodeDetails) {
	            errorCodeDetail.setErrorCode(errorCode);
	            entityManager.merge(errorCodeDetail);
	        }
	    }	  
	    
//	    @Transactional
//	    public void updateErrorCodeDetail(int detailId, String description) {
//	        ErrorCodeDetail errorCodeDetail = entityManager.find(ErrorCodeDetail.class, detailId);
//	        if (errorCodeDetail != null) {
//	            errorCodeDetail.setDescription(description);
//	            entityManager.merge(errorCodeDetail);
//	        }
//	    }

	    @Transactional
	    public void deleteErrorCode(int codeId) {
	       erepo.deleteById(codeId);
//	        ErrorCode errorCode = entityManager.find(ErrorCode.class, codeId);
//	        if (errorCode != null) {
//	            entityManager.remove(errorCode);
//	        }
	    }
	    
	   
	    
	    public void addErrorCode(ErrorCode errorCode) {
	        erepo.save(errorCode); 
	    }

	    @Transactional
	    public void updateErrorCodeDetail(int detailId, String description) {
	        ErrorCodeDetail errorCodeDetail = entityManager.find(ErrorCodeDetail.class, detailId);
	        if (errorCodeDetail != null) {
	            errorCodeDetail.setDescription(description);
	            entityManager.merge(errorCodeDetail);
	        }
	    }

	    @Transactional
	    public void deleteErrorCodeDetail(int detailId) {
//	        ErrorCodeDetail errorCodeDetail = entityManager.find(ErrorCodeDetail.class, detailId);
//	        if (errorCodeDetail != null) {
//	            entityManager.remove(errorCodeDetail);
//	        }
	    	drepo.deleteById(detailId);
	    }
	    
	    @Transactional
	    public void addErrorCodeDetail(ErrorCodeDetailRequest request) {
	        ErrorCode errorCode = entityManager.find(ErrorCode.class, request.getCodeId());
	        if (errorCode != null) {
	            ErrorCodeDetail errorCodeDetail = new ErrorCodeDetail();
	            errorCodeDetail.setDescription(request.getDescription());
	            errorCodeDetail.setErrorCode(errorCode);
	            entityManager.persist(errorCodeDetail);
	        } else {
	            throw new IllegalArgumentException("ErrorCode with codeId " + request.getCodeId() + " not found");
	        }
	    }
	    
	    @Transactional
	    public void addErrorCodeDetailByCodeId(int codeId, String description) {
	        ErrorCode errorCode = entityManager.find(ErrorCode.class, codeId);
	        if (errorCode != null) {
	            ErrorCodeDetail errorCodeDetail = new ErrorCodeDetail();
	            errorCodeDetail.setDescription(description);
	            errorCodeDetail.setErrorCode(errorCode);
	            entityManager.persist(errorCodeDetail);
	        } else {
	            throw new IllegalArgumentException("ErrorCode with codeId " + codeId + " not found");
	        }
	    }

	    
}
