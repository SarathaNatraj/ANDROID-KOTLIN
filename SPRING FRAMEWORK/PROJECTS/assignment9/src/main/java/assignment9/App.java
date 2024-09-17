package assignment9;

import java.util.Scanner;

import org.springframework.context.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import assignment9.service.EmployeeService;

public class App {
	public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService employeeService = context.getBean(EmployeeService.class);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Print all employees");
            System.out.println("2. Search employee by ID");
            System.out.println("3. Delete employee by ID");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    employeeService.getAllEmployees().forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Enter employee ID: ");
                    int searchId = scanner.nextInt();
                    System.out.println(employeeService.getEmployeeById(searchId));
                    break;
                case 3:
                    System.out.print("Enter employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    boolean success = employeeService.deleteEmployeeById(deleteId);
                    if (success) {
                        System.out.println("Employee deleted.");
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}

