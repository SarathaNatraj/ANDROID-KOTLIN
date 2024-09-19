package com.techacademy.springdemo.service;

import org.springframework.stereotype.Service;

import com.techacademy.springdemo.entity.Customer;

import java.util.List;


public interface CustomerService {
    public List<Customer> getCustomers(int theSortField);

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer (int theId);

    public void deleteCustomer(int theId);

    public List<Customer> searchCustomer(String theSearchName);
}
