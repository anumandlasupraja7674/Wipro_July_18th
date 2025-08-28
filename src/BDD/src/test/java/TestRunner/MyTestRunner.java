package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/Features/RegistrationPage.feature"},
		glue = {"StepDefinitions","Hooks"},
		tags = "@Sanity",
		plugin = {
		        "pretty",                               
		        "html:target/cucumber-reports.html",     
		        "json:target/cucumber.json" ,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"             // JSON report (optional, for CI tools)
		    },
		    monochrome = true
		)

public class MyTestRunner extends AbstractTestNGCucumberTests{

}
