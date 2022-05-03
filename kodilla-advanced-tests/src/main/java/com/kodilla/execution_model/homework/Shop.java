package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }


    public int getOrderSize() {
        return this.orders.size();
    }


    public List<Order> getOrdersBeetweenTwoDates(LocalDate date1, LocalDate date2) {
        List<Order> filterOrders = orders
                .stream()
                .filter(o -> Period.between(o.getOrderDate(), LocalDate.now()).getYears() <= 2)
                .collect(Collectors.toList());
        return filterOrders;
    }


    public double getSum() {
        double sum = orders
                .stream()
                .map(o -> o.getValue())
                .mapToDouble(o -> o)
                .sum();
        return sum;
    }


    public List<Order> getOrdersByPrice(double minPrice, double maxPrice) {
        List<Order> ordersByPrice = new ArrayList<>();
        for (Order order : orders) {
            if (minPrice < order.getValue() && order.getValue() < maxPrice) {
                ordersByPrice.add(order);
            }
        }
        return ordersByPrice;
    }


    public Order getOrder(int index) {
        if (index >= 0 && index < orders.size()) {
            return this.orders.get(index);
        }
        return null;
    }
}