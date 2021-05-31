package com.kodilla.jmsorders.receiver;

import com.kodilla.jmsorders.model.Order;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class OrdersReceiver {

    @JmsListener(containerFactory = "jmsFactory", destination = "orders-queue")
    public void receiveMessage(Order order) {
        System.out.println("Received order: " + order.toString());
    }
}