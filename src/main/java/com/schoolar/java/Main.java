package com.schoolar.java;

import com.schoolar.java.customers.entity.Contact;
import com.schoolar.java.customers.entity.Customer;
import com.schoolar.java.customers.entity.Order;
import com.schoolar.java.customers.service.CustomerService;

import java.util.stream.Stream;

public class Main {

    private static CustomerService cs = CustomerService.getInstance();

    @SuppressWarnings( "java:S106" )
    public static void main( String[] args ) {
         initDb();
    }

    private static void initDb() {

        var john = new Customer();
        john.setName( "John Doe" );
        john.setContact( new Contact( "+12345", "john.doe@example.com" ) );
        john.addOrder( createOrder( "Laptop", 1000.0 ) );

        var max = new Customer();
        max.setName( "Max Smith" );
        max.setContact( new Contact( "+67890", "max.smith@example.com" ) );
        max.addOrder( createOrder( "Tablet", 500.0 ) );

        var silvia = new Customer();
        silvia.setName( "Silvia Garcia" );
        silvia.setContact( new Contact( "+54321", "silvia.garcia@example.com" ) );
        silvia.addOrder( createOrder( "Smartphone", 800.0 ) );

        var julia = new Customer();
        julia.setName( "Julia Brown" );
        julia.setContact( new Contact( "+98765", "julia.brown@example.com" ) );

        Stream.of( john, max, silvia, julia )
                .forEach( customer -> {
                    try {
                        var createdCustomer = cs.createCustomer( customer );
                        System.out.println( createdCustomer );
                    } catch ( Exception e ) {
                        System.err.println( e.getMessage() );
                    }
                } );

    }

    private static Order createOrder( String productName, double price ) {
        var order = new Order();
        order.setProductName( productName );
        order.setPrice( price );
        return order;
    }
}
