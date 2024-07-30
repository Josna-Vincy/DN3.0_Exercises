package com.example.employees;

import java.util.Arrays;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count++] = employee;
        } else {
            System.out.println("Employee array is full. Cannot add more employees.");
        }
    }

    public Employee searchEmployeeById(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void deleteEmployeeById(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--count] = null;
                System.out.println("Employee with ID " + employeeId + " deleted.");
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }

    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        ems.addEmployee(new Employee(1, "Josna Vincy", "Manager", 70000));
        ems.addEmployee(new Employee(2, "Vincy Jos", "Developer", 60000));
        ems.addEmployee(new Employee(3, "Jos Vi", "Designer", 50000));

        System.out.println("All Employees:");
        ems.traverseEmployees();
        System.out.println("\nSearching for employee with ID 2:");
        Employee employee = ems.searchEmployeeById(2);
        System.out.println(employee != null ? employee : "Employee not found");
        System.out.println("\nDeleting employee with ID 1:");
        ems.deleteEmployeeById(2);
        System.out.println("\nAll Employees after deletion:");
        ems.traverseEmployees();
    }
}
