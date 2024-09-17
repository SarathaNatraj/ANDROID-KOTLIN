package assignment9.repository;

import java.util.ArrayList;
import java.util.List;

import assignment9.dto.Employee;

public class EmployeeRepository {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeRepository() {
        employees.add(new Employee(1, "E001", "Alice", "New York"));
        employees.add(new Employee(2, "E002", "Bob", "Los Angeles"));
        employees.add(new Employee(3, "E003", "Charlie", "Chicago"));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        return employees.stream().filter(emp -> emp.getId() == id).findFirst().orElse(null);
    }

    public Employee getEmployeeByEmployeeId(String employeeId) {
        return employees.stream().filter(emp -> emp.getEmployeeId().equals(employeeId)).findFirst().orElse(null);
    }

    public boolean deleteEmployeeById(int id) {
        return employees.removeIf(emp -> emp.getId() == id);
    }
}

