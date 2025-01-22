package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength(){
        CashMachine cm = new CashMachine();
        int[] values = cm.getTr();
        assertEquals(0, values.length);

    }

    @Test
    public void shouldGetAverageIn(){
        CashMachine machine = new CashMachine();
        assertEquals(150, machine.getAverageIn(), 0.01);
    }

    @Test
    public void shouldGetAverageOut(){
        CashMachine machine = new CashMachine();
        assertEquals(-75, machine.getAverageOut(), 0.01);
    }

    @Test
    public void shouldAddTwoTransactionsIn(){
        CashMachine cm = new CashMachine();
        cm.add(100);
        cm.add(200);

        int[] values = cm.getTransactionIn();
        assertEquals(values.length, 2);
    }

    @Test
    public void shouldAddTwoTransactionsOut(){
        CashMachine cm = new CashMachine();
        cm.add(-100);
        cm.add(-50);

        int[] values = cm.getTransactionOut();
        assertEquals(values.length, 2);

    }
}
