package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testGetOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("6"));
        Order isOrderInWarehouse = warehouse.getOrder("6");
        assertEquals("6", isOrderInWarehouse.getNumber());
    }

    @Test
    public void testGetOrder_withException() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        Order isOrderInWarehouse = warehouse.getOrder("123");
        assertEquals("123", isOrderInWarehouse.getNumber());
    }
}