package com.kodilla.jmsorders.controller;

import com.kodilla.jmsorders.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private JmsTemplate jmsTemplate;

    @PostMapping(path = "/process")
    public void processOrder(@RequestBody Order order) {
        jmsTemplate.convertAndSend("orders-queue", order);
    }
}