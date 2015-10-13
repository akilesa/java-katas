package com.akilesa_kata.spring_boot_kata.persistence.model;

import javax.persistence.*;

/**
 * Created by akilesa on 02.10.15.
 */
@Entity
@Table(name = "sys_order_item", uniqueConstraints = {@UniqueConstraint(columnNames = {"good_id", "order_id"})})
public class OrderItem extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "good_id")
    private Good good;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItem orderItem = (OrderItem) o;

        if (good != null ? !good.equals(orderItem.good) : orderItem.good != null) return false;
        if (order != null ? !order.equals(orderItem.order) : orderItem.order != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = good != null ? good.hashCode() : 0;
        result = 31 * result + (order != null ? order.hashCode() : 0);
        return result;
    }
}
