package com.kodilla.exeption.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testAddOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("0001"));

        Order IsOrderAdded = warehouse.getOrder("0001");

        assertEquals("0001", IsOrderAdded.getNumber());
    }

    @Test
    public void testToGetOrder_withExeption() {
        Warehouse warehouse = new Warehouse();

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("0001"));

    }
}