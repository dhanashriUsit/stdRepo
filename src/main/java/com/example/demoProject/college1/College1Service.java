package com.example.demoProject.college1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class College1Service {

    @Autowired
    private College1Repository college1Repository;

    public College1 addCollege1(College1 college1) {
        return college1Repository.save(college1);
    }

    public List<College1> getAllColleges1() {
        return college1Repository.findAll();
    }

    public List<College1> getCollege1() {
        return college1Repository.findAll();
    }
}
