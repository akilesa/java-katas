package com.akilesa_kata.spring_boot_kata.persistence.repo;

import com.akilesa_kata.spring_boot_kata.persistence.model.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by akilesa on 02.10.15.
 */
public interface OrderRepository extends CrudRepository<Order,Long> {
}
