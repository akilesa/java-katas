package com.akilesa_kata.spring_ws_kata.ws;

import com.akilesa_kata.helloservice.HelloServiceRequest;
import com.akilesa_kata.helloservice.HelloServiceResponse;
import com.akilesa_kata.spring_ws_kata.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by akilesa on 04.10.15.
 */
@Endpoint
public class HelloServiceEndpoint {

    private static final String NAMESPACE = "http://www.akilesa_kata.com/HelloService";

    @Autowired
    private HelloService helloService;

    @PayloadRoot(localPart = "HelloServiceRequest", namespace = NAMESPACE)
    @ResponsePayload
    public HelloServiceResponse callHalloService(@RequestPayload HelloServiceRequest request) {
        try {
            HelloServiceResponse response = new HelloServiceResponse();
            response.setHello(helloService.hello(request.getName()));
            GregorianCalendar cal = new GregorianCalendar();
            cal.setTime(new Date());
            XMLGregorianCalendar xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
            response.setCurrentTime(xmlGregorianCalendar);
            return response;
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
}
