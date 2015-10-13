package com.akilesa_kata.spring_boot_kata.persistence.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by akilesa on 02.10.15.
 */
@Entity
@Table(name = "sys_order")
public class Order extends BaseEntity {

    @Column(name = "code", nullable = false, unique = true)
    private String code;

    @OneToMany(mappedBy = "order")
    private Set<OrderItem> orderItems = new HashSet<>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(Set<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (code != null ? !code.equals(order.code) : order.code != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }
}
