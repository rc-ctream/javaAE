package com.schoolar.java.customers.service;

import com.schoolar.java.customers.entity.Contact;
import com.schoolar.java.customers.entity.Customer;
import com.schoolar.java.customers.persistence.CustomerRepository;

import java.util.List;

public class CustomerService {

    private static final CustomerService INSTANCE = new CustomerService();
    private final CustomerRepository customerRepository;

    public static CustomerService getInstance() {
        return INSTANCE;
    }

    private CustomerService() {
        this.customerRepository = new CustomerRepository();
    }

    public Customer createCustomer( String name, String email ) {
        var customer = new Customer();
        customer.setName( name );

        var contact = new Contact();
        contact.setEmail( email );

        customer.setContact( contact );

        return this.customerRepository.save( customer );
    }

    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById( long id ) {
        return customerRepository.findOneById( id );
    }

    public void updateCustomer( Customer customer ) {
        customerRepository.update( customer );
    }

    public Customer createCustomer( Customer customer ) {
        return this.customerRepository.save( customer );
    }
}
