package com.schoolar.java;

import com.schoolar.java.customers.service.CustomerService;

import java.util.Scanner;

public class Main {

    private static CustomerService CUSTOMER_SERVICE = CustomerService.getInstance();

    @SuppressWarnings( "java:S106" )
    public static void main( String[] args ) {

        var scanner = new Scanner( System.in );
        while ( scanner.hasNextLine() ) {
            var input = scanner.next();
            if (input == "a") {
            }

            System.out.println("xxx");
        }

        CUSTOMER_SERVICE
                .getAll()
                .forEach( System.out::println );

    }
}
