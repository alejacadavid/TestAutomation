package Selenide.Steps;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./src/test/resources/features"},
        glue = {"Selenide/Steps/SubstractingSteps"},
        tags = {"@example1"})
public class SubstractingSteps {

    int numOne = 0;
    int numTwo = 0;
    int res1 = 0;

    @Given("^There are a number (\\d+)$")
    public void there_are_a_number(int num1) throws Exception {
        numOne = num1;
    }

    @When("^I substract (\\d+)$")
    public void i_substract(int num2) throws Exception {
        numTwo = num2;
    }

    @Then("^I should have (\\d+)$")
    public void i_should_have(int res) throws Exception {
        res1 = numOne - numTwo;
        System.out.println(numOne +" - " + numTwo + " = " + res);
        Assert.assertEquals(res1,res);
    }

}
