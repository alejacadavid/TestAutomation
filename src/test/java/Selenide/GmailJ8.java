package Selenide;

import com.codeborne.selenide.Condition;
import cucumber.api.java8.En;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.LocalFileDetector;

import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GmailJ8 implements En {

    public void GmailJ8(){
        Given("^a browser with the page of gmail$", () -> {
            open("https://mail.google.com");
        });

        When("^the user enter the \"([^\"]*)\" and the \"([^\"]*)\"$", (String username, String password) -> {
            $("#identifierId").val(username).pressEnter();
            $("#password input").val(password).pressEnter();
            $(byText("Loading")).waitUntil(disappears, 50000);
        });

        Then("^should be send a email to \"([^\"]*)\" with a file in the path \"([^\"]*)\"$", (String correo, String ruta) -> {

            $(byXpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
            $(By.name("to")).val(correo).pressTab();
            $(by("placeholder", "Asunto")).val("Prueba").pressTab();

            $(".editable").val("Soy un mensaje.").pressEnter();


            $(byText("Enviar")).click();

            $(withText("Tu mensaje se ha enviado.")).shouldBe(Condition.visible);
            $(byText("Undo")).click();
        });


    }


}
