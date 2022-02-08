package com.kodilla.execution_model;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
class InvoiceTestSuite {
    @Test
    public void AddItemToInvoice() {
        Invoice invoice = new Invoice();
        Item apple = new Item("Apple", 3.20);
        Item guitar = new Item("Guitar", 500.90);
        Item bread = new Item("Bread", 5.50);
        invoice.addItem(bread);
        invoice.addItem(guitar);
        invoice.addItem(apple);
        int numberOfItems = invoice.getSize();
        assertEquals(3, numberOfItems);
    }
    @Test
    public void GetItem() {
        Invoice invoice = new Invoice();
        Item apple = new Item("Apple", 3.20);
        Item guitar = new Item("Guitar", 500.90);
        Item bread = new Item("Bread", 5.50);
        invoice.addItem(bread);
        invoice.addItem(guitar);
        invoice.addItem(apple);
        Item result = invoice.getItem(2);
        assertEquals("Bread", result.getName());
        assertEquals(5.50, result.getPrice());
    }
    @Test
    public void UjemnyIndex() {
        Invoice invoice = new Invoice();
        Item apple = new Item("Apple", 3.20);
        Item guitar = new Item("Guitar", 500.90);
        Item bread = new Item("Bread", 5.50);
        invoice.addItem(bread);
        invoice.addItem(guitar);
        invoice.addItem(apple);
        Item result = invoice.getItem(-2);
        assertNull(result);
    }
    @Test
    public void DuzyIndex() {
        Invoice invoice = new Invoice();
        Item apple = new Item("Apple", 3.20);
        Item guitar = new Item("Guitar", 500.90);
        Item bread = new Item("Bread", 5.50);
        invoice.addItem(bread);
        invoice.addItem(guitar);
        invoice.addItem(apple);
        Item result = invoice.getItem(500);
        assertNull(result);
    }
    @Test
    public void Null() {
        Invoice invoice = new Invoice();
        Item apple = new Item("Apple", 3.20);
        Item guitar = new Item("Guitar", 500.90);
        Item bread = new Item("Bread", 5.50);
        invoice.addItem(bread);
        invoice.addItem(guitar);
        invoice.addItem(apple);
        invoice.clear();
        assertEquals(0, invoice.getSize());
    }
}