package com.kodilla.exeption.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("5"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("3"));

        try {
            Order order = warehouse.getOrder("0");
            System.out.println("Your order is: " + order.getNumber());
        } catch (Exception e) {
            System.out.println("There is no order with this number!");
        }
    }
}
