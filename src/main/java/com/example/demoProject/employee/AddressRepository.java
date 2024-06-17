package com.example.demoProject.employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AddressRepository extends JpaRepository<Address1, Long> {
    List<Address1> findByEmployeeId(Long employeeId);

}
