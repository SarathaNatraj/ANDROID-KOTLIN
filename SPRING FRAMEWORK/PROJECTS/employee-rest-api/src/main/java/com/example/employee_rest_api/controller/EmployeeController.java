package com.example.employee_rest_api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.employee_rest_api.model.Employee;
import com.example.employee_rest_api.service.EmployeeService;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService = new EmployeeService();

    // Get all employees
    @GetMapping
    @ResponseBody
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    
    
 // Get public hello
    @GetMapping("/public/hello")
    @ResponseBody
    public String publicHello() {
        return "hello from public endpoint !";
    }
    
 // Get private hello
    @GetMapping("/private/hello")
    @ResponseBody
    public String privateHello() {
        return "hello from private endpoint !";
    }


    // Get employee by ID
    @GetMapping("/{id}")
    @ResponseBody
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    // Add a new employee
    @PostMapping
    @ResponseBody
    public String addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return "Employee added successfully!";
    }

    // Delete employee by ID
    @DeleteMapping("/{id}")
    @ResponseBody
    public String deleteEmployee(@PathVariable int id) {
        boolean isRemoved = employeeService.deleteEmployeeById(id);
        if (isRemoved) {
            return "Employee deleted successfully!";
        } else {
            return "Employee not found!";
        }
    }
}

