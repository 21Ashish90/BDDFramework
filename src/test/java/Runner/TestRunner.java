package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "./src/test/java/Feature/Login.feature", 
		glue = "StepDefiniation", 
		dryRun = false, 
		plugin = {"html:Reports/HTMLReport.html", "junit:Reports/XMLReport.xml", "json:Reports/JSONReport.html" }
)
public class TestRunner {

}
