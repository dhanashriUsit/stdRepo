package com.example.demoProject.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StdRepo extends JpaRepository<Student, Integer> {

}
