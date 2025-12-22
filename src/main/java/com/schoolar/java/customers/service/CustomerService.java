package com.schoolar.java.customers.service;

import com.schoolar.java.customers.Customer;
import com.schoolar.java.customers.persistence.CustomerRepository;

public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService() {
        this.customerRepository = new CustomerRepository();
    }

    public Customer createCustomer( String name, String email ) {
        var customer = new Customer();
        customer.setName( name );
        customer.setEmail( email );
        return this.customerRepository.save( customer );
    }

}
