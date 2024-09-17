package assignment9.dto;

public class Employee {
    private int id;
    private String employeeId;
    private String name;
    private String address;

    // Constructor
    public Employee(int id, String employeeId, String name, String address) {
        this.id = id;
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", employeeId=" + employeeId + ", name=" + name + ", address=" + address + "]";
    }
}
