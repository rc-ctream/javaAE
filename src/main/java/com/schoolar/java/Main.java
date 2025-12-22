package com.schoolar.java;

import com.schoolar.java.customers.Customer;
import jakarta.persistence.Persistence;

public class Main {

    public static void main( String[] args ) {
        var entityManager = Persistence
                .createEntityManagerFactory( "customerPU" )
                .createEntityManager();

        entityManager.getTransaction().begin();

        // create new customer
        var customer = new Customer();
        customer.setName( "Max" );
        customer.setEmail( "max@crm.info" );

        entityManager.persist( customer );
        entityManager.getTransaction().commit();

        // get customer
        entityManager.getTransaction().begin();
        var john = entityManager.find( Customer.class, 1L );
        System.out.println( john );
        entityManager.getTransaction().commit();


        // close connection to db
        entityManager.close();
        Persistence.createEntityManagerFactory( "customerPU" ).close();
    }
}
