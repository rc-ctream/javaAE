package com.schoolar.java;

import com.schoolar.java.customers.service.CustomerService;

public class Main {

    public static void main( String[] args ) {
        var customerService = new CustomerService();
        customerService.getAll()
                .forEach( System.out::println );

    }
}
