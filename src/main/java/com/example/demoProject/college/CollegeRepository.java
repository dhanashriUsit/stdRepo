package com.example.demoProject.college;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {

}
