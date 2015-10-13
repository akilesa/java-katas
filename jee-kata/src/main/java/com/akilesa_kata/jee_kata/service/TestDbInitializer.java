package com.akilesa_kata.jee_kata.service;

import com.akilesa_kata.jee_kata.persistence.model.Good;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.transaction.Transactional;

/**
 * Created by akilesa on 08.10.15.
 */
@Singleton
@Startup
public class TestDbInitializer {

    @PersistenceUnit(unitName = "jee-kata-unit")
    EntityManagerFactory entityManagerFactory;

    @Transactional
    @PostConstruct
    public void init() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.persist(new Good("good1"));
        entityManager.persist(new Good("good2"));
    }
}
