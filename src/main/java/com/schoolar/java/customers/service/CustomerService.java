package com.schoolar.java.customers.service;

import com.schoolar.java.customers.entity.Customer;
import com.schoolar.java.customers.persistence.CustomerRepository;

import java.util.List;

public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService() {
        this.customerRepository = new CustomerRepository();
    }

    public Customer createCustomer( String name, String email ) {
        var customer = new Customer();
        customer.setName( name );
        customer.setPost( email );
        return this.customerRepository.save( customer );
    }

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

}
