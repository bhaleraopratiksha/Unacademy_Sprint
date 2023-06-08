package testrunner;

import org.testng.annotations.Test;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		 features = "src/test/resources/Features/Scenario1.feature",
		glue={"Stepdefination_Subscription", "apphooks"},
		plugin= {"pretty" ,
		"html:target/creport/cucumber",
		"json:target/creport/cucumber.json",
		 "junit:target/creport/cucumber.xml"}
		 )

public class TestRunner_Subscription extends AbstractTestNGCucumberTests{
  
}