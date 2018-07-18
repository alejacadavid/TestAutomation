package Selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java8.En;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CustomerSteps implements En {

    public CustomerSteps(){



        Given("^user is on Home Page$", () -> {
            System.setProperty("selenide.browser","Chrome");
            open("http://shop.demoqa.com");

        });

        When("^he search for \"([^\"]*)\"$", (String product) -> {

            $(byXpath("//*[@class='noo-search icon_search']")).click();
            $(byName("s")).val(product).waitUntil(Condition.visible,10000).pressEnter();

        });

        When("^choose to buy the first item$", () -> {
            sleep(500);
            SelenideElement elem = $(byXpath("(//div[contains(@class,'noo-product-item')])[11]")).waitUntil(Condition.visible,10000);
            //elem.scrollTo().hover();
            elem.click();;
            //elem.hover().$(byXpath("//*[contains(@class,'add_to_cart_button')]")).click();
        });

        When("^moves to checkout from mini cart$", () -> {
            /*$(byXpath("//*[contains(@class, 'btn view-cart')]")).waitUntil(Condition.visible,6000).click();
            $(byXpath("//*[contains(@class,'checkout-button button alt wc-forward')]")).click();*/

        });

        When("^enter \"([^\"]*)\" personal details on checkout page$", (String name) -> {
           /* Customer customer = new JsonReader().getCustomerByName(name);
            $(byId("billing_first_name")).sendKeys(customer.firstName);*/

        });

        When("^select same delivery address$", () -> {
        });

        When("^select payment method as \"([^\"]*)\" payment$", (String arg1) -> {
        });

        When("^place the order$", () -> {
        });

    }
}
