package simplegame;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static simplegame.Divider.checkFizzBuzz;

public class DividerChecker {

    private int number;
    private String answer;

    @Given("number is 3")
    public void number_is_3() {
        this.number = 3;
    }
    @Given("number is 5")
    public void number_is_5() {
        this.number = 5;
    }
    @Given("number is 15")
    public void number_is_15() {
        this.number = 15;
    }
    @Given("number is 17")
    public void number_is_17() {
        this.number = 17;
    }
    @Given("number is 21")
    public void number_is_21() {
        this.number = 21;
    }
    @Given("number is 25")
    public void number_is_25() {
        this.number = 25;
    }
    @Given("number is 28")
    public void number_is_28() {
        this.number = 28;
    }


    @When("is it divided by 3 or 5")
    public void is_it_divided_by_3_or_5() {
        this.answer = checkFizzBuzz(this.number);
    }
    @Then("I must say {string}")
    public void i_must_say(String string) {
        assertEquals(string, this.answer);
    }
}
