package com.library.repository;

import com.library.entity.Employee;
import com.library.projection.EmployeeDetails;
import com.library.projection.EmployeeNameAndDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Interface-based projection
    List<EmployeeNameAndDepartment> findByDepartmentName(String departmentName);

    // Class-based projection
    @Query("SELECT new com.library.projection.EmployeeDetails(e.name, e.department.name) FROM Employee e WHERE e.department.name = :departmentName")
    List<EmployeeDetails> findEmployeeDetailsByDepartmentName(String departmentName);
}


