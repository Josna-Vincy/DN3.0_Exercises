package com.library.controller;

import com.library.entity.Department;
import com.library.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    // Other CRUD endpoints...

    // Get department by name
    @GetMapping("/searchByName/{name}")
    public ResponseEntity<Department> getDepartmentByName(@PathVariable String name) {
        Department department = departmentRepository.findDepartmentByName(name);
        return department != null ? ResponseEntity.ok(department) : ResponseEntity.notFound().build();
    }
}
