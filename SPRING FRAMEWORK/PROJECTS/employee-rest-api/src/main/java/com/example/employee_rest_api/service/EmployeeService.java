package com.example.employee_rest_api.service;

import java.util.ArrayList;
import java.util.List;

import com.example.employee_rest_api.model.Employee;



public class EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeService() {
        // Sample employees
        employeeList.add(new Employee(1, "John Doe", "Developer"));
        employeeList.add(new Employee(2, "Jane Smith", "Manager"));
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    // Get employee by ID
    public Employee getEmployeeById(int id) {
        return employeeList.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    // Add employee
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    // Delete employee by ID
    public boolean deleteEmployeeById(int id) {
        return employeeList.removeIf(e -> e.getId() == id);
    }
}

