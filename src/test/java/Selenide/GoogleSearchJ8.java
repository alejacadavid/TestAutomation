package Selenide;

import cucumber.api.java8.En;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleSearchJ8 implements En {

    public GoogleSearchJ8(){
        Given("^un navegador con www\\.google\\.com$", () -> {
            open("https://google.com/ncr");
        });

        When("^la palabra \"([^\"]*)\" es ingresada en el campo de búsqueda$", (String keyword) -> {
            $(By.name("q")).val(keyword).pressEnter();
        });

        Then("^el top (\\d+) debe ser mostrado$", (Integer resultsCount) -> {
            $$("#ires .g").shouldHave(size(resultsCount));
        });

    }
}
