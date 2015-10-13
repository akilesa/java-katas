package com.akilesa_kata.spring_ws_kata.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by akilesa on 04.10.15.
 */
@Controller
public class IndexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    {
        LOGGER.trace("IndexController class created");
    }

    @RequestMapping(name = "/")
    public String index() {
        return "index";
    }
}
