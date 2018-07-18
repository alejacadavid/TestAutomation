package Selenide;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchStepDefinitions {
    private String keyword;

    @Given("an open browser with google.com")
    public void openGoogleSearch() {
        open("https://google.com/ncr");
    }

    @When("a keyword (.*) is entered in input field")
    public void enterKeyword(String keyword) {
        $(By.name("q")).val(keyword).pressEnter();
    }

    @Then("top (\\d+) matches should be shown")
    public void topTenMatchesShouldBeShown(int resultsCount) {
        $$("#ires .g").shouldHave(size(resultsCount));
    }

}
