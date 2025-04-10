package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        assertEquals( 200, wallet.getBalance());
    }
    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }
    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        assertEquals(30, cashSlot.getContents());
    }

    @Given("I have deposited $0 in my wallet")
    public void i_have_deposited_$0_in_my_wallet() {
        wallet.deposit(0);
        assertEquals(wallet, wallet.getBalance());
    }
    @When("I request $50")
    public void i_request_$50() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 50);
    }
    @Then("Money can't be dispensed")
    public void money_can_t_be_dispensed1() {
        assertEquals(0, cashSlot.getContents());
    }
    @Given("I have deposited $25 in my wallet")
    public void i_have_deposited_$25_in_my_wallet() {
        wallet.deposit(25);
        assertEquals(wallet, wallet.getBalance());
    }
    @When("I request $26")
    public void i_request_$26() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 26);
    }
    @Then("Money can't be dispensed")
    public void money_can_t_be_dispensed2() {
        assertEquals(25, cashSlot.getContents());
    }
}
