package com.kodilla.execution_model.homework;

import com.kodilla.execution_model.Invoice;
import com.kodilla.execution_model.Item;

import java.time.LocalDate;

public class Order {
    public double value;
    public LocalDate OrderDate;
    public String login;

    public Order(double value, LocalDate OrderDate, String login) {
        this.value = value;
        this.OrderDate = OrderDate;
        this.login = login;
    }


    public double getValue() {
        return value;
    }


    public LocalDate getOrderDate() {
        return OrderDate;
    }


    public String getLogin() {
        return login;
    }


    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", OrderDate=" + OrderDate +
                ", login='" + login + '\'' +
                '}';
    }
}
