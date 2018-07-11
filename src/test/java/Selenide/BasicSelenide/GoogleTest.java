package Selenide.BasicSelenide;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTest {

    @Test
    public void search(){

        open("http://www.google.com");
        $(By.name("q")).val("Selenide").pressEnter();
        $$("#ires").shouldHaveSize(1);
        $("#ires").shouldBe(Condition.visible).shouldHave(text("selenide.org/"));
    }

    @Test
    public void search1(){
        int[] i = {0};
        open("http://www.google.com");
        $("#lst-ib").setValue("Selenide").pressEnter();
        $$("#ires").findBy(text("GitHub - codeborne/selenide: Concise UI Tests with Java!")).click();
        String xpathTitulo = "//article[@class='markdown-body entry-content']//h1";
        $(By.xpath(xpathTitulo)).waitUntil(Condition.exist,5000);
        //$("#ires").shouldBe(Condition.visible).shouldHave(text("selenide.org/"));
    }


}
