package com.schoolar.java.customers.persistence;

import com.schoolar.java.customers.entity.Customer;

import java.util.List;

public class CustomerRepository {

    public Customer save( Customer customer ) {
        try ( var em = JPAUtil.createEntityManager() ) {
            em.getTransaction().begin();
            em.persist( customer );
            em.getTransaction().commit();

            return em.find( Customer.class, customer.getId() );
        }
    }

    public List<Customer> findAll() {
        try ( var em = JPAUtil.createEntityManager() ) {
            em.getTransaction().begin();
            return em
                    .createQuery( "SELECT c FROM Customer c", Customer.class )
                    .getResultList();
        }
    }

    public Customer findOneById( long id ) {
        try ( var em = JPAUtil.createEntityManager() ) {
            em.getTransaction().begin();
            return em
                    .createQuery( "SELECT c FROM Customer c where c.id = :id", Customer.class )
                    .setParameter( "id", id )
                    .getSingleResult();
        }
    }

    public void update( Customer customer ) {
        try ( var em = JPAUtil.createEntityManager() ) {
            em.getTransaction().begin();
            em.merge( customer );
            em.getTransaction().commit();
        }
    }
}
