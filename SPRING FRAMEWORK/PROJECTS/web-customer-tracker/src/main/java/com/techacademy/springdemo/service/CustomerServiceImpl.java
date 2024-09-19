package com.techacademy.springdemo.service;

import com.techacademy.springdemo.dao.CustomerDAO;
import com.techacademy.springdemo.dao.CustomerDAOImpl;
import com.techacademy.springdemo.entity.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    // need to injection customer DAO
    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional //fetch the transaction from sessionFactory, once operation tx.commit()
    public List<Customer> getCustomers(int theSortField) {
        return customerDAO.getCustomers(theSortField); // Delegate calls to DAO
    }

    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer) {

        customerDAO.saveCustomer(theCustomer);
    }

    @Override
    @Transactional
    public Customer getCustomer(int theId) {

        return customerDAO.getCustomer(theId);
    }

    @Override
    @Transactional
    public void deleteCustomer(int theId) {

        customerDAO.deleteCustomer(theId);
    }

    @Override
    @Transactional
    public List<Customer> searchCustomer(String theSearchName) {

        return customerDAO.searchCustomers(theSearchName);
    }

}













