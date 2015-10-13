package com.akilesa_kata.jee_kata.persistence.dao;

import com.akilesa_kata.jee_kata.persistence.model.BaseEntity;

import java.util.List;

/**
 * Created by akilesa on 05.10.15.
 */
public interface GenericDao<T extends BaseEntity, ID> {

    T get(ID id);

    List<T> getAll();
}
