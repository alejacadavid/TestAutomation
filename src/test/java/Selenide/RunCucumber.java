package Selenide;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./src/test/resources/features"},
                glue = {"Selenide"},
                plugin = {"pretty", "html:reports/cucumber-html-report","json:cucumber.json"},
                tags = {"@Customer"})
public class RunCucumber {
}
