package com.tw.apistackbase.controller;

import com.tw.apistackbase.Object.Employee;
import com.tw.apistackbase.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping(produces = {"application/json"})
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> employeeList = employeeService.getAllEmployee();
        return ResponseEntity.ok(employeeList);
    }

    @GetMapping(path = "/{id}",produces = {"application/json"})
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer id) {
        Employee employeeList = employeeService.getEmployee(id);
        return ResponseEntity.ok(employeeList);
    }

    @GetMapping(path = "${gender}",produces = {"application/json"})
    public ResponseEntity<List<Employee>> getEmployeeWithGender(@PathVariable String gender) {
        List<Employee> employeeList = employeeService.getEmployeeWithGender(gender);
        return ResponseEntity.ok(employeeList);
    }

    @PostMapping(produces = {"application/json"})
    public ResponseEntity<List<Employee>> addEmployee(@RequestBody Employee employee) {
        List<Employee> employeeList = employeeService.addEmployee(employee);
        return ResponseEntity.ok(employeeList);
    }

    @PutMapping(path = "/{id}", produces = {"application/json"})
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer id,@RequestBody Employee employee) {
        Employee updatedEmployee = employeeService.updateEmployee(id,employee);
        return ResponseEntity.ok(updatedEmployee);
    }

    @DeleteMapping(path = "/{id}", produces = {"application/json"})
    public ResponseEntity<List<Employee>> deleteEmployee(@PathVariable Integer id) {
        List<Employee> employeeList = employeeService.deleteEmployee(id);
        return ResponseEntity.ok(employeeList);
    }
}
