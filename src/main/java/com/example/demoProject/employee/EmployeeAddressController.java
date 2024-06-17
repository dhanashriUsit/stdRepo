//package com.example.demoProject.employee;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//@CrossOrigin
//@RestController
//@RequestMapping("/api/employees")
//public class EmployeeAddressController {
//    @Autowired
//    private EmployeeAddressService employeeAddressService;
//
////    @GetMapping("/emp")
////    public List<Employee1> getAllEmployees() {
////        return employeeAddressService.getAllEmployees();
////    }
//
////    @GetMapping("/{employeeId}")
////    public Optional<Address1> getEmployeeAddresses(@PathVariable Long employeeId) {
////        return employeeAddressService.getEmployeeAddresses(employeeId);
////    }
////    
////    @GetMapping("/add/{employeeId}")
////    public List<Address1> getAddressByEmployeeId(@PathVariable Long employeeId) {
////        return employeeAddressService.getAddressesByEmployeeId(employeeId);
////    }
//
//    @GetMapping("/emp")
//    public List<Employee1> getAllEmployees() {
//        return employeeAddressService.getAllEmployees();
//    }
//
//    @GetMapping("/addresses")
//    public List<Address1> getAllAddresses() {
//        return employeeAddressService.getAllAddresses();
//    }
//    
//    @GetMapping("/addresses/{employeeId}")
//    public List<Address1> getAddressesByEmployeeId(@PathVariable Long employeeId) {
//        return employeeAddressService.getAddressesByEmployeeId(employeeId);
//    }
//
//}