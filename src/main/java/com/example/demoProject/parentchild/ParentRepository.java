package com.example.demoProject.parentchild;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ParentRepository extends JpaRepository<Parent, Integer>{

}
