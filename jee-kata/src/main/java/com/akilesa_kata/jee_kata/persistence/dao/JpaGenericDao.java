package com.akilesa_kata.jee_kata.persistence.dao;

import com.akilesa_kata.jee_kata.persistence.model.BaseEntity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaQuery;
import java.util.Collections;
import java.util.List;

/**
 * Created by akilesa on 05.10.15.
 */
public abstract class JpaGenericDao<T extends BaseEntity, ID> implements GenericDao<T, ID> {

    @PersistenceUnit(unitName = "jee-kata-unit")
    private EntityManagerFactory entityManagerFactory;

    private EntityManager entityManager;

    private Class<T> persistenceClass;

    public JpaGenericDao(Class<T> persistenceClass) {
        this.persistenceClass = persistenceClass;
    }

    @Override
    public T get(ID id) {
        return entityManager.find(persistenceClass, id);
    }

    @Override
    public List<T> getAll() {
        CriteriaQuery<T> criteriaQuery = entityManager
                .getCriteriaBuilder().createQuery(persistenceClass);
        TypedQuery<T> query = entityManager.createQuery(criteriaQuery);
        List<T> resultList = query.getResultList();
        return resultList == null ? Collections.<T>emptyList() : resultList;
    }

    @PostConstruct
    public void init() {
        entityManager = entityManagerFactory.createEntityManager();
    }

    @PreDestroy
    public void destroy() {
        if (entityManager.isOpen()) {
            entityManager.close();
        }
    }
}
