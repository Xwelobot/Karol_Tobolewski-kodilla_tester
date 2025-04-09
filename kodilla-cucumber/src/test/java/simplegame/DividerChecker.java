package simplegame;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DividerChecker {

    private String answer;

    @Given("number is {int}")
    public void numer_is(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("is_it_divided_by_3_or_5")
    public void is_it_divided_by_3_or_5(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I must say {string}")
    public void i_must_say(String string) {
        assertEquals(string, this.answer);
    }
}
