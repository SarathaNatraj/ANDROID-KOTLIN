package assignment9.service;

import java.util.List;

import assignment9.dto.Employee;
import assignment9.repository.EmployeeRepository;

public class EmployeeService {

    private EmployeeRepository employeeRepository;

    // Constructor-based Dependency Injection
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.getEmployeeById(id);
    }

    public Employee getEmployeeByEmployeeId(String employeeId) {
        return employeeRepository.getEmployeeByEmployeeId(employeeId);
    }

    public boolean deleteEmployeeById(int id) {
        return employeeRepository.deleteEmployeeById(id);
    }
}
