package com.schoolar.java.customers.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    public static final String PERSISTENCE_UNIT_NAME = "customerPU";

    private static final EntityManagerFactory EMF = Persistence
            .createEntityManagerFactory( PERSISTENCE_UNIT_NAME );

    private static final EntityManager EM = EMF.createEntityManager();

    private JPAUtil() {
    }

    public static EntityManagerFactory createEMF() {
        return EMF;
    }

    public static void shutdown() {
        EM.close();
        EMF.close();
    }

    public static EntityManager createEntityManager() {
        return EM;
    }
}
