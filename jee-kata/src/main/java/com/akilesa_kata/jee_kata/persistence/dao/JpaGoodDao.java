package com.akilesa_kata.jee_kata.persistence.dao;

import com.akilesa_kata.jee_kata.annotations.JpaDao;
import com.akilesa_kata.jee_kata.persistence.model.Good;

/**
 * Created by akilesa on 05.10.15.
 */
@JpaDao
public class JpaGoodDao extends JpaGenericDao<Good, Long> implements GoodDao {

    public JpaGoodDao() {
        super(Good.class);
    }
}
