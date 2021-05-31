package com.kodilla.jmsorders.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {

    private Client client;
    private List<Product> products;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date date;

    OrderStatus status;

    public Order() {
    }

    public Order(Client client, Date date, List<Product> products, OrderStatus status) {
        this.date = date;
        this.client = client;
        this.products = products;
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public Date getDate() {
        return date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "client='" + client + '\'' +
                ", date='" + date + '\'' +
                ", products='" + products + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

}
