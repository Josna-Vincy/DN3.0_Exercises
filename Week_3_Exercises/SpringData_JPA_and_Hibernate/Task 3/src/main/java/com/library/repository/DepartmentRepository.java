package com.library.repository;

import com.library.EmployeeManagementSystemApplication;
import com.library.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Derived query method to find a department by its name
    Department findByName(String name);
}
