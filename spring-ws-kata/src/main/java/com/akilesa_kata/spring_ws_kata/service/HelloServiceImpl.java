package com.akilesa_kata.spring_ws_kata.service;

import org.springframework.stereotype.Service;

/**
 * Created by akilesa on 04.10.15.
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello, " + name + "!!!";
    }
}
