package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();

    Order order1 = new Order(21.37, new Date(2020-9-11), "user1");
    Order order2 = new Order(221.37, new Date(2025-11-1), "user2");
    Order order3 = new Order(321.37, new Date(2021-9-21), "user3");

    @BeforeEach
    public void initializeShop(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    public void testAddNewOrder(){
        Order order = new Order(22.1, new Date(2010-9-11), "user11");
        shop.addOrder(order);

        assertEquals(4, shop.getOrderCount());
    }

    @Test
    public void testGetOrderBasedOnDates(){
        Date startDate = new Date(2019-9-11);
        Date endDate = new Date(2022-9-11);
        List<Order> orders = shop.getOrdersByDateRange(startDate, endDate);

        assertEquals(2, orders.size());
    }

    @Test
    public void testGetOrdersByValueRange() {

        List<Order> orders = shop.getOrdersByValueRange(21.37, 220.00);

        assertEquals(1, orders.size());
        assertEquals(21.37, orders.get(0).getValue());
    }

    @Test
    public void testGetSumOfAllOrders(){

        double orders = shop.getTotalOrderValue();

        assertEquals(564.11, orders);
    }

    @Test
    public void testGetSizeOfOrders(){
        int ordersSize = shop.getOrderCount();

        assertEquals(3, ordersSize);
    }

}