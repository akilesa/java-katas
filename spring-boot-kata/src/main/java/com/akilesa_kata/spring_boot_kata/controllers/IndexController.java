package com.akilesa_kata.spring_boot_kata.controllers;

import com.akilesa_kata.spring_boot_kata.persistence.model.Order;
import com.akilesa_kata.spring_boot_kata.persistence.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by akilesa on 02.10.15.
 */
@Controller
public class IndexController {

    @Autowired
    private OrderRepository orderRepository;

    @RequestMapping("/")
    public ModelAndView index() {
        Iterable<Order> orders = orderRepository.findAll();
        return new ModelAndView("index", "orders", orders);
    }
}
