package com.schoolar.java.customers.persistence;

import com.schoolar.java.customers.Customer;

public class CustomerRepository {

    public Customer save( Customer customer ) {
        try ( var em = JPAUtil.createEntityManager() ) {
            em.getTransaction().begin();
            em.persist( customer );
            em.getTransaction().commit();

            return em.find( Customer.class, customer.getId() );
        }
    }
}
