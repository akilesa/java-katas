package com.akilesa_kata.spring_ws_kata.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by akilesa on 04.10.15.
 */
@ComponentScan(basePackages = {"com.akilesa_kata.spring_ws_kata.service"})
@Configuration
public class SpringServiceConfig {
}
