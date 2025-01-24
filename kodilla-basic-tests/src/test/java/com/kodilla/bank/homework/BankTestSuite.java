package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveAllSaldoLength() {
        CashMachine cm = new CashMachine();
        int[] values = cm.getTr();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddTwoTransactionsIn() {
        CashMachine cm = new CashMachine();
        cm.add(100);
        cm.add(200);

        int countOfTr = cm.getTransactionIn();
        assertEquals(countOfTr, 2);
    }

    @Test
    public void shouldAddTwoTransactionsInBelow(){
        CashMachine cm = new CashMachine();
        cm.add(-100);

        int countOfTr = cm.getTransactionIn();
        assertEquals(countOfTr, 0);
    }

    @Test
    public void shouldAddTwoTransactionsOut() {
        CashMachine cm = new CashMachine();
        cm.add(-100);
        cm.add(-50);

        int values = cm.getTransactionOut();
        assertEquals(values, 2);

    }

    @Test
    public void shouldAddTwoTransactionsOutAbove() {
        CashMachine cm = new CashMachine();
        cm.add(100);

        int vaules = cm.getTransactionOut();
        assertEquals(vaules, 0);
    }

    @Test
    public void shouldGetAverageIn(){
        CashMachine machine = new CashMachine();

        machine.add(200);
        machine.add(100);
        assertEquals(150, machine.getAverageIn(), 0.01);
    }

    @Test
    public void shouldGetAverageInZeroTr(){
        CashMachine machine = new CashMachine();

        machine.add(0);
        assertEquals(0, machine.getAverageIn(), 0.01);
    }

    @Test
    public void shouldGetAverageOut(){
        CashMachine machine = new CashMachine();

        machine.add(-100);
        machine.add(-50);
        assertEquals(-75, machine.getAverageOut(), 0.01);
    }

    @Test
    public void shouldGetAverageOutZeroTr(){
        CashMachine machine = new CashMachine();

        machine.add(10);
        assertEquals(10, machine.getAverageIn(), 0.01);
    }
}
