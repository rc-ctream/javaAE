package com.schoolar.java;

import com.schoolar.java.customers.service.CustomerService;

public class Main {

    public static void main( String[] args ) {
        var name = "Max";
        var email = "max@email.com";
        var customerService = new CustomerService();

        var createdCustomer = customerService.createCustomer( name, email );
        System.out.println( createdCustomer );
    }
}
