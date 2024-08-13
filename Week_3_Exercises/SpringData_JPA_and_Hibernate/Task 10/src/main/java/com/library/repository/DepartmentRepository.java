package com.library.repository;

import com.library.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findByNameStartingWith(String prefix);

    @Query("SELECT d FROM Department d WHERE d.name = :name")
    Department findDepartmentByName(String name);
}
