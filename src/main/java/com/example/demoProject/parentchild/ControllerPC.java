package com.example.demoProject.parentchild;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ControllerPC {

	@Autowired
	ServicePC service;
	
	@PutMapping("/{childId}/value")
    public void updateChildValue(@PathVariable int childId, @RequestBody long newValue) {
        service.updateChildValue(childId, newValue);
    }
	
	@GetMapping("/ids")
    public List<Integer> getParentIds() {
        return service.getParentIds();
    }

	
	@PostMapping("/addparent")
	public void addParent(@RequestBody Parent parent) {
       service.addParent(parent);	
	}
	
	
	@PostMapping("/addchild/{parentId}")
	public void addChildToParent(@PathVariable int parentId, @RequestBody Child child) {
	    service.addChildToParent(parentId, child);
	}

	 @GetMapping("/child/{parentId}")
	 public List<Child> getChildrenByParentId(@PathVariable int parentId) {
	      return service.getChildrenByParentId(parentId);
	   }

	 
	 @GetMapping("/page/{parentId}")
	    public Page<Child> getPage(@PathVariable int parentId,
	                                             @RequestParam(defaultValue = "0") int page,
	                                             @RequestParam(defaultValue = "10") int size) {
	        Pageable pageable = PageRequest.of(page, size);
	        return service.getChildrenByParentId11(parentId, pageable);
	    }

	 
	
}
