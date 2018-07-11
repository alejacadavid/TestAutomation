package Selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleTest {

    WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver");
        driver = new ChromeDriver();

    }

    @After
    public void close(){
        if(driver != null){
            driver.quit();
        }

    }

    @Test
    public void googleTest(){
        driver.get("http://www.google.com/");
        WebElement enterQuery = driver.findElement(By.id("lst-ib"));
        enterQuery.sendKeys("Selenium");
        enterQuery.submit();


    }

}
