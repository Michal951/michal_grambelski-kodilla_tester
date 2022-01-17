package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("5"));
        warehouse.addOrder(new Order("6"));

        try {
            Order isOrderInWarehouse = warehouse.getOrder("123");
        } catch (OrderDoesntExistException e) {
            e.printStackTrace();
            System.out.println("Order doestn exist");
        }
    }
}