package com.library.projection;

import org.springframework.beans.factory.annotation.Value;

public class EmployeeDetails {
    private final String name;
    private final String departmentName;

    public EmployeeDetails(String name, String departmentName) {
        this.name = name;
        this.departmentName = departmentName;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
