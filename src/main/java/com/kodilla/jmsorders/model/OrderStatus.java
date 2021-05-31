package com.kodilla.jmsorders.model;

import java.io.Serializable;

public enum OrderStatus implements Serializable {
    PLACED,
    IN_PROGRESS,
    COMPLETED,
    CANCELLED
}
