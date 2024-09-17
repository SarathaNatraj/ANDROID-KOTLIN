package assignment9;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import assignment9.repository.EmployeeRepository;
import assignment9.service.EmployeeService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public EmployeeRepository employeeRepository() {
        return new EmployeeRepository();
    }

    @Bean
    public EmployeeService employeeService(EmployeeRepository employeeRepository) {
        return new EmployeeService(employeeRepository);
    }
}
