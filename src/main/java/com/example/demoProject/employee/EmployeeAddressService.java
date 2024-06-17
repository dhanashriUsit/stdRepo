//package com.example.demoProject.employee;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class EmployeeAddressService {
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Autowired
//    private AddressRepository addressRepository;
//
//    @Autowired
//    private EntityManager entityManager;
//
////    public List<Employee1> getAllEmployees() {
////        return employeeRepository.findAll();
////    }
////
////    public Optional<Address1> getEmployeeAddresses(Long employeeId) {
////        return addressRepository.findById(employeeId);
////    }
////    
////    public List<Address1> getAddressesByEmployeeId(Long employeeId) {
////        return addressRepository.findByEmployeeId(employeeId);
////    }
//    
//    public List<Employee1> getAllEmployees() {
//        String jpql = "SELECT e FROM Employee1 e";
//        TypedQuery<Employee1> query = entityManager.createQuery(jpql, Employee1.class);
//        return query.getResultList();
//    }
//
//    public List<Address1> getAllAddresses() {
//        String jpql = "SELECT a FROM Address1 a";
//        TypedQuery<Address1> query = entityManager.createQuery(jpql, Address1.class);
//        return query.getResultList();
//    }
//
//    
//    public List<Address1> getAddressesByEmployeeId(Long employeeId) {
//        TypedQuery<Address1> query = entityManager.createQuery(
//                "SELECT a FROM Address1 a WHERE a.employee.id = :employeeId", Address1.class);
//        query.setParameter("employeeId", employeeId);
//        return query.getResultList();
//    }
//    
//}
