package com.akilesa_kata.jee_kata.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by akilesa on 05.10.15.
 */
@Entity
@Table(name = "sys_good")
public class Good extends BaseEntity {

    @Column(name = "name", unique = true)
    private String name;


    public Good() {
    }

    public Good(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Good good = (Good) o;

        if (name != null ? !name.equals(good.name) : good.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
