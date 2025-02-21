package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Date;

public class Order {
    private double value;
    private Date date;
    private String login;

    public Order(double value, Date date, String login) {
        this.value = value;
        this.date = new Date();
        this.login = login;
    }

    public double getValue(){
        return value;
    }

    public Date getDate(){
        return date;
    }

    public String getLogin(){
        return login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date=" + date +
                ", login=" + login +
                '}';
    }
}
