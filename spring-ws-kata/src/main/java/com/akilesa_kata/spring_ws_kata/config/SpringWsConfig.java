package com.akilesa_kata.spring_ws_kata.config;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

/**
 * Created by akilesa on 04.10.15.
 */
@EnableWs
@Configuration
@ComponentScan(basePackages = {"com.akilesa_kata.spring_ws_kata.ws"})
public class SpringWsConfig extends WsConfigurerAdapter {

    @Bean(name = "hello")
    public DefaultWsdl11Definition defaultWsdl11Definition() {
        DefaultWsdl11Definition bean = new DefaultWsdl11Definition();
        bean.setLocationUri("/ws");
        bean.setSchema(helloServiceXsd());
        bean.setTargetNamespace("http://www.akilesa_kata.com/HelloService");
        bean.setPortTypeName("Hello");
        return bean;
    }

    @Bean
    public XsdSchema helloServiceXsd() {
        return new SimpleXsdSchema(new ClassPathResource("xsd/HelloService.xsd"));
    }
}
