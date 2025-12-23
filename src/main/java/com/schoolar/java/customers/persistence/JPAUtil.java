package com.schoolar.java.customers.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    static final String PERSISTENCE_UNIT_NAME = "customerPU";

    private static final EntityManagerFactory MANAGER_FACTORY = Persistence
            .createEntityManagerFactory( PERSISTENCE_UNIT_NAME );

    private JPAUtil() {
    }

    public static EntityManager createEntityManager() {
        return MANAGER_FACTORY.createEntityManager();
    }

}