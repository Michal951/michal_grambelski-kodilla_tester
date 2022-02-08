package com.kodilla.execution_model.homework;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();


    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public int getOrderSize() {
        return this.orders.size();
    }


    public Order getOrder(int index) {
        if (index >= 0 && index < orders.size()) {
            return this.orders.get(index);
        }
        return null;
    }

}
