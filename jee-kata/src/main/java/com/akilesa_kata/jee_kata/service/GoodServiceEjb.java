package com.akilesa_kata.jee_kata.service;

import com.akilesa_kata.jee_kata.annotations.JpaDao;
import com.akilesa_kata.jee_kata.persistence.dao.GoodDao;
import com.akilesa_kata.jee_kata.persistence.model.Good;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by akilesa on 05.10.15.
 */
@Stateless
public class GoodServiceEjb implements GoodService {

    @Inject @JpaDao
    private GoodDao goodDao;

    @Transactional
    @Override
    public List<Good> findAll() {
        return goodDao.getAll();
    }
}
