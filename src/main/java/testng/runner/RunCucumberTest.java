package testng.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(tags = "", features = {"src/test/resources/Features/Verification_Cucumber.feature"}, glue = {"stepDefinition"},
plugin = {"pretty,json:target/cucumber.json"})

public class RunCucumberTest extends AbstractTestNGCucumberTests{

}
