package com.example.demoProject.college1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface College1Repository extends JpaRepository<College1, Integer> {
}
