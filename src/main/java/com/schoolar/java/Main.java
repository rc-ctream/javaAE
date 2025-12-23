package com.schoolar.java;

import com.schoolar.java.customers.service.CustomerService;

public class Main {

    private static CustomerService cs = CustomerService.getInstance();

    @SuppressWarnings( "java:S106" )
    public static void main( String[] args ) {
        cs.getAll().forEach( System.out::println );

        var customer = cs.getCustomerById(1L);
        System.out.println(customer);
    }
}
