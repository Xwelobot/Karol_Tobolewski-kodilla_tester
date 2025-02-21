package com.kodilla.execution_model.homework;

import java.util.*;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders;

    public Shop() {
        this.orders = new HashSet<>();
    }

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrdersByDateRange(Date startDate, Date endDate) {
        return orders.stream()
                .filter(order -> !order.getDate().before(startDate) && !order.getDate().after(endDate))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersByValueRange(double minValue, double maxValue) {
        return orders.stream()
                .filter(order -> order.getValue() >= minValue && order.getValue() <= maxValue)
                .collect(Collectors.toList());
    }

    public int getOrderCount() {
        return orders.size();
    }

    public double getTotalOrderValue() {
        return orders.stream()
                .mapToDouble(Order::getValue)
                .sum();
    }
}
