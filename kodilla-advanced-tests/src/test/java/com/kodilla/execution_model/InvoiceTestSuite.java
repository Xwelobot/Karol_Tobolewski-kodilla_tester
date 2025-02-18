package com.kodilla.execution_model;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTestSuite {
    Invoice invoice = new Invoice();
    Item milk = new Item("Milk", 3.50);
    Item eggs = new Item("Eggs", 8.00);
    Item bread = new Item("Bread", 4.15);


    @Test
    public void testAddItem(){
        int items = invoice.getSize();

        assertEquals(3, items);
    }

    @Test
    public void testIfHaveCorrectValues(){
        Item result = invoice.getItem(1);

        assertEquals("Eggs", result.getName());
        assertEquals(8.00, result.getPrice());
    }

    @Test
    public void testIfAskForMinusIndex(){
        Item items = invoice.getItem(-1);

        assertEquals(null, items);
    }

    @Test
    public void testIfAskForHighIndex(){
        Item items = invoice.getItem(12);

        assertEquals(null, items);
    }

    @Test
    public void testIfCanClean(){
        int invoiceSize = invoice.getSize();

        invoice.clear();

        assertEquals(0,invoice.getSize());
        assertEquals(3,invoiceSize);
    }

    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(milk);
        invoice.addItem(eggs);
        invoice.addItem(bread);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}