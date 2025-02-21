package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {
    Shop shop = new Shop();


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate date1 = LocalDate.parse("2020-01-01", formatter);
    LocalDate date2 = LocalDate.parse("2019-01-01", formatter);
    LocalDate date3 = LocalDate.parse("2025-01-01", formatter);

    Order order1 = new Order(21.37, date1, "user1");
    Order order2 = new Order(221.37, date2, "user2");
    Order order3 = new Order(321.37, date3, "user3");


    @BeforeEach
    public void initializeShop(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }

    @Test
    public void testAddNewOrder(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse("2020-01-01", formatter);
        Order order = new Order(22.1, date, "user11");
        shop.addOrder(order);

        assertEquals(4, shop.getOrderCount());
    }

    @Test
    public void testGetOrderBasedOnDates() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate startDate = LocalDate.parse("2019-01-01", formatter);
        LocalDate endDate = LocalDate.parse("2023-01-01", formatter);

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