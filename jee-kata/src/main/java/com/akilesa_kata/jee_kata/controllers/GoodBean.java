package com.akilesa_kata.jee_kata.controllers;

import com.akilesa_kata.jee_kata.persistence.model.Good;
import com.akilesa_kata.jee_kata.service.GoodService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 * Created by akilesa on 04.10.15.
 */

@ManagedBean(name = "Good")
@SessionScoped
public class GoodBean implements Serializable {

    @Inject
    private GoodService goodService;

    public List<Good> getGoodList() {
        return goodService.findAll();
    }
}
