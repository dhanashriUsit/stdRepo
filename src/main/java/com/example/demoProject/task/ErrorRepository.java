package com.example.demoProject.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ErrorRepository extends JpaRepository<ErrorCode, Integer> {

}
