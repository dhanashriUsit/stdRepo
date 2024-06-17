package com.example.demoProject.college1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/colleges1")
public class College1Controller {

    @Autowired
    private College1Service college1Service;

    @PostMapping
    public ResponseEntity<College1> addCollege1(@RequestBody College1 college1) {
        College1 newCollege1 = college1Service.addCollege1(college1);
        return ResponseEntity.ok(newCollege1);
    }

    @GetMapping
    public ResponseEntity<List<College1>> getAllColleges1() {
        List<College1> colleges1 = college1Service.getAllColleges1();
        return ResponseEntity.ok(colleges1);
    }

    @GetMapping("/get")
    public List<College1> getCollege1() {
        return college1Service.getCollege1();
                
    }
}
