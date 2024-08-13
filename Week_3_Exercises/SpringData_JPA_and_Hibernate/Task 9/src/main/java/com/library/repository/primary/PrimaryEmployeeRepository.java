package com.library.repository.primary;

import org.springframework.data.jpa.repository.JpaRepository;
import com.library.entity.Employee;

public interface PrimaryEmployeeRepository extends JpaRepository<Employee, Long> {
    // Define any custom query methods if needed
}
