package Selenide;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

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

    @Test
    public void testTabSelenium(){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/drivers/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://portal.gestiondelriesgo.gov.co/");
        sleep(6000);
        String window = driver.getWindowHandle();
        System.out.println(window);
        driver.findElement(byXpath("//img[@src='/PublishingImages/Paginas/Forms/Recursos/MGRD.png']")).click();
        String window2 = driver.getWindowHandle();
        System.out.println(window2);
        driver.switchTo().window(window);
    }

    @Test
    public void testTabSelenide(){
        System.setProperty("selenide.browser", "Chrome");
        open("http://portal.gestiondelriesgo.gov.co/");
        sleep(5000);
        $(byXpath("//img[@src='/PublishingImages/Paginas/Forms/Recursos/MGRD.png']")).click();
        switchTo().window(0);
        sleep(7000);
    }


}
