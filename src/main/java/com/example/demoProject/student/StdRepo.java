package com.example.demoProject.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StdRepo extends JpaRepository<Student, Integer> {

}
