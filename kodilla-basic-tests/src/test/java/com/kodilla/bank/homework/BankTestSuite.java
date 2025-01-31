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
    public void shouldHaveAnySaldoLength(){
        CashMachine bankomat1 = new CashMachine();
        bankomat1.add(100);

        CashMachine bankomat2 = new CashMachine();
        bankomat2.add(100);
        bankomat2.add(200);

        CashMachine bankomat3 = new CashMachine();
        bankomat3.add(100);
        bankomat3.add(100);
        bankomat3.add(100);

        CashMachine[] bankomaty = new CashMachine[]{
                bankomat1, bankomat2, bankomat3
        };

        Bank bank = new Bank(bankomaty);

        int saldoOfAll = bank.getSaldoOfAllCashMachine();

        assertEquals(700, saldoOfAll);
    }

    @Test
    public void TrIn() {
        CashMachine bankomat3 = new CashMachine();
        bankomat3.add(100);
        bankomat3.add(100);
        bankomat3.add(-100);

        CashMachine bankomat2 = new CashMachine();
        bankomat2.add(100);
        bankomat2.add(200);

        CashMachine[] bankomaty = new CashMachine[]{ bankomat3, bankomat2};
        Bank bank = new Bank(bankomaty);

        int trIn = bank.getTransactionIn();

        assertEquals(4, trIn);
    }

    @Test
    public void TrInZero() {
        CashMachine bankomat3 = new CashMachine();
        bankomat3.add(-100);
        bankomat3.add(0);
        bankomat3.add(-100);

        CashMachine bankomat2 = new CashMachine();
        bankomat2.add(-100);
        bankomat2.add(-200);

        CashMachine[] bankomaty = new CashMachine[]{ bankomat3, bankomat2};
        Bank bank = new Bank(bankomaty);

        int trIn = bank.getTransactionIn();

        assertEquals(0, trIn);
    }

    @Test
    public void TrOut() {
        CashMachine bankomat3 = new CashMachine();
        bankomat3.add(-100);
        bankomat3.add(100);
        bankomat3.add(-100);

        CashMachine bankomat2 = new CashMachine();
        bankomat2.add(100);
        bankomat2.add(-200);

        CashMachine[] bankomaty = new CashMachine[]{ bankomat3, bankomat2};
        Bank bank = new Bank(bankomaty);

        int trOut = bank.getTransactionOut();

        assertEquals(3, trOut);
    }

    @Test
    public void TrOutZero() {
        CashMachine bankomat3 = new CashMachine();
        bankomat3.add(100);
        bankomat3.add(100);
        bankomat3.add(0);

        CashMachine bankomat2 = new CashMachine();
        bankomat2.add(100);
        bankomat2.add(200);

        CashMachine[] bankomaty = new CashMachine[]{ bankomat3, bankomat2};
        Bank bank = new Bank(bankomaty);

        int trOutZero = bank.getTransactionOut();

        assertEquals(0, trOutZero);
    }

    @Test
    public void AvgIn() {
        CashMachine bankomat3 = new CashMachine();
        bankomat3.add(150);
        bankomat3.add(30);

        CashMachine bankomat2 = new CashMachine();
        bankomat2.add(100);

        CashMachine[] bankomaty = new CashMachine[]{ bankomat3, bankomat2};
        Bank bank = new Bank(bankomaty);

        double avgIn = bank.getAverageIn();

        assertEquals(95.0, avgIn, 0.1);
    }

    @Test
    public void AvgInMinus() {
        CashMachine bankomat3 = new CashMachine();
        bankomat3.add(-200);
        bankomat3.add(100);

        CashMachine bankomat2 = new CashMachine();
        bankomat2.add(100);
        bankomat2.add(-200);

        CashMachine[] bankomaty = new CashMachine[]{ bankomat3, bankomat2};
        Bank bank = new Bank(bankomaty);

        double avgInMinus = bank.getAverageIn();

        assertEquals(100, avgInMinus, 0.1);
    }

    @Test
    public void AvgOut() {
        CashMachine bankomat3 = new CashMachine();
        bankomat3.add(100);
        bankomat3.add(200);
        bankomat3.add(-37);

        CashMachine bankomat2 = new CashMachine();
        bankomat2.add(100);
        bankomat2.add(-200);

        CashMachine[] bankomaty = new CashMachine[]{ bankomat3, bankomat2};
        Bank bank = new Bank(bankomaty);

        double avgOut = bank.getAverageOut();

        assertEquals(-118.5, avgOut, 0.1);
    }

}
