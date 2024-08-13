package com.library.repository;

import com.library.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Custom query method to find departments by name prefix
    List<Department> findByNameStartingWith(String prefix);

    // Named query to find a department by name
    @Query(value = "SELECT * FROM Department d WHERE d.name = :name", nativeQuery = true)
    Department findByName(@Param("name") String name);

    Department findDepartmentByName(String name);
}
