package com.kodilla.homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class WalletMoneyTestSuite {

    private WalletMoney walletMoney;
    private boolean withdrawalSuccessful;
    private int dispensedAmount;
    private String message;

    @Given("there is ${int} in my wallet")
    public void there_is_money_in_my_wallet(int amount) {
        walletMoney = new WalletMoney();
        walletMoney.deposit(amount);
    }

    @When("I withdraw ${int}")
    public void i_withdraw(int amount) {
        withdrawalSuccessful = walletMoney.withdraw(amount);
        dispensedAmount = withdrawalSuccessful ? amount : 0;
        if (!withdrawalSuccessful) {
            message = "I don't have enough money in my wallet";
        }
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertEquals(0, dispensedAmount);
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_dont_have_enough_money() {
        assertEquals("I don't have enough money in my wallet", message);
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        // This step is handled implicitly
    }

    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is(int expectedBalance) {
        assertEquals(expectedBalance, walletMoney.getBalance());
    }
}