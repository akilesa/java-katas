package com.akilesa_kata.jee_kata.service;

import java.util.List;

/**
 * Created by akilesa on 05.10.15.
 */
public interface GenericService<T> {

    List<T> findAll();
}
