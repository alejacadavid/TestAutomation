package Selenide.BasicSelenide;

import com.codeborne.selenide.Condition;
import org.junit.BeforeClass;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.disappears;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GmailTest {

    private static String gmailUsername = System.getProperty("gmail.username", "ingrese email");
    private static String gmailPassword = System.getProperty("gmail.password", "ingrese pass");

    @BeforeClass
    public static void init(){
        String baseUrl = "http://www.gmail.com/";
        open(baseUrl);
        $("#identifierId").val(gmailUsername).pressEnter();
        $("#password input").val(gmailPassword).pressEnter();
        $(byText("Loading")).waitUntil(disappears, 50000);
        $(byXpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
        $(By.name("to")).val("mariacadavid@seven4n.com").pressTab();
        $(by("placeholder", "Asunto")).val("Prueba").pressTab();

        $(".editable").val("Soy un mensaje.").pressEnter();
        $(byText("Enviar")).click();
        $(withText("Tu mensaje se ha enviado.")).shouldBe(Condition.visible);
        $(byText("Undo")).click();
    }

}
