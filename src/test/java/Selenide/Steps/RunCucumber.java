package Selenide.Steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./src/test/resources/features"},
        glue = {"Selenide/Steps"},
        plugin = {"pretty", "html:reports/cucumber-html-report","json:cucumber.json"},
        tags = {})
public class RunCucumber {
}
