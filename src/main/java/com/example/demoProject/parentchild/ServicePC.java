package com.example.demoProject.parentchild;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.example.demoProject.college.College;
import com.example.demoProject.college.University;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@org.springframework.stereotype.Service
public class ServicePC {
	
	@Autowired
	ChildRepository crepo;
	
	@Autowired
	ParentRepository prepo;

	@Autowired
    private EntityManager entityManager;

	
	public List<Child> getChildrenByParentId(int parentId) {
        String jpql = "SELECT c FROM Child c WHERE c.parent.pId = :parentId ORDER BY value desc";
        Query query = entityManager.createQuery(jpql, Child.class);
        query.setParameter("parentId", parentId);
        return query.getResultList();
    }
	
	
	
	 @Transactional
	    public void updateChildValue(int childId, long newValue) {
	        Child child = crepo.findById(childId).orElse(null);
	        if (child != null) {
	            child.setValue(newValue);
	            crepo.save(child);
	        } else {
	          
	        }
	    }
	
    public List<Integer> getParentIds() {
        String jpql = "SELECT p.pId FROM Parent p";
        Query query = entityManager.createQuery(jpql);
        return query.getResultList();
    }
 
   	
	public void addParent(Parent parent) {
		prepo.save(parent);
	}
	
	public void addChildToParent(int parentId, Child child) {
	    Parent parent = prepo.findById(parentId).orElse(null);
	    if (parent != null) {
	        child.setParent(parent);
	        crepo.save(child);
	    } else {
	       
	    }
	}
	
	
	 public Page<Child> getChildrenByParentId11(int parentId, Pageable pageable) {
	        String jpql = "SELECT c FROM Child c WHERE c.parent.pId = :parentId";
	        Query query = entityManager.createQuery(jpql, Child.class);
	        query.setParameter("parentId", parentId);

	        query.setFirstResult(pageable.getPageNumber() * pageable.getPageSize());
	        query.setMaxResults(pageable.getPageSize());

	        List<Child> children = query.getResultList();

	        long count = getCountOfChildren(parentId);

	        return new PageImpl<>(children, pageable, count);
	    }

	 
	    private long getCountOfChildren(int parentId) {
	        String countJpql = "SELECT COUNT(c) FROM Child c WHERE c.parent.pId = :parentId";
	        Query countQuery = entityManager.createQuery(countJpql);
	        countQuery.setParameter("parentId", parentId);
	        return (long) countQuery.getSingleResult();
	    }

	

}
