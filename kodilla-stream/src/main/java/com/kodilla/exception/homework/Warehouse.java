package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrder(String number) throws Exception {
        return orderList
                .stream()
                .filter(o -> o.getNumber().equals(number))
                //.findFirst().orElseThrow(OrderDoesntExistException::new);
                .findFirst().orElseThrow(()-> new Exception("dupa"));
    }
}