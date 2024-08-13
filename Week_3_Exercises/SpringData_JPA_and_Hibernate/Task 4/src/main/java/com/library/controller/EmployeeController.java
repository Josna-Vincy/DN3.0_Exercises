package com.library.controller;

import com.library.entity.Employee;
import com.library.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Other CRUD endpoints...

    // Get employees by department name
    @GetMapping("/department/{departmentName}")
    public List<Employee> getEmployeesByDepartmentName(@PathVariable String departmentName) {
        return employeeRepository.findByDepartmentName(departmentName);
    }

    // Get employees by name
    @GetMapping("/searchByName/{name}")
    public List<Employee> getEmployeesByName(@PathVariable String name) {
        return employeeRepository.findEmployeesByName(name);
    }
}
