package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();
    Order guitar = new Order(1699, LocalDate.of(2019, 1, 10), "Wokulski");
    Order bassGuitar = new Order(2500, LocalDate.of(2021, 2, 13), "Rzecki");
    Order microphone = new Order(1000, LocalDate.of(2020, 3, 17), "Suzin");
    Order drums = new Order(3000, LocalDate.of(2023, 4, 23), "Ochocki");


    @BeforeEach
    void addOrdersToShop() {
        shop.addOrder(guitar);
        shop.addOrder(bassGuitar);
        shop.addOrder(microphone);
        shop.addOrder(drums);
    }


    @Test
    void returnSumOfAllOrders() {
        assertEquals(8199, shop.getSum());
    }


    @Test
    void returnOrdersNumber() {
        assertEquals(4, shop.getOrderSize());
    }


    @Test
    void returnOrderListByDates() {
        assertEquals(3, shop.getOrdersBeetweenTwoDates(LocalDate.of(2021, 2, 13),
                LocalDate.of(2021, 3, 17)).size());
    }


    @Test
    public void returnNullWhenPassingOutOfRangeIndex() {
        Order result = shop.getOrder(9);
        assertNull(result);
    }


    @Test
    void returnOrderListWithGivenValueRange() {
        assertEquals(1699, shop.getOrdersByPrice(1000, 2000).get(0).getValue());
    }
}