package Selenide.Steps;

import Selenide.Customer;
import Selenide.JsonReader;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java8.En;
import cucumber.api.java8.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLOutput;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class CustomerSteps implements En {

    public CustomerSteps(){



        Given("^user is on Home Page$", () -> {
            /*open("http://shop.demoqa.com");*/
        });

        When("^he search for \"([^\"]*)\"$", (String product) -> {
           /* $(byXpath("//*[@class='noo-search icon_search']")).click();
            $(byName("s")).val(product).pressEnter().waitUntil(Condition.appears,10000);*/
        });

        When("^choose to buy the first item$", () -> {
           /* SelenideElement elem = $$(byXpath("//div[contains(@class,'noo-product-item')]")).first().waitUntil(Condition.appears,10000);
            elem.hover().$(byXpath("//*[contains(@class,'add_to_cart_button')]")).click();
            Thread.sleep(5000);*/
        });

        When("^moves to checkout from mini cart$", () -> {
            /*$(byXpath("//*[contains(@class, 'btn view-cart')]")).waitUntil(Condition.visible,6000).click();*/
        });

        When("^enter \"([^\"]*)\" personal details on checkout page$", (String name) -> {
            //Customer customer = new JsonReader().getCustomerByName(name);

            new JsonReader().getCustomerAll();
        });

        When("^select same delivery address$", () -> {
        });

        When("^select payment method as \"([^\"]*)\" payment$", (String arg1) -> {
        });

        When("^place the order$", () -> {
        });

    }
}
