package Selenide;

import com.codeborne.selenide.Condition;
import cucumber.api.java8.En;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CalculadoraSteps implements En {

    public CalculadoraSteps() {

        Given("^un navegador con la calculadora online$", () -> {
            open("http://calculadora.name/");
        });

        When("^el usuario ingrese la operacion \"([^\"]*)\" y presione click en el boton =$", (String op) -> {
            $(By.id("input")).val(op).pressEnter();
        });

        Then("^el usuario debería obtener el resultado (\\d+)$", (Integer res) -> {
            $(By.id("input")).shouldBe(Condition.value(res.toString()));
        });

    }
}
