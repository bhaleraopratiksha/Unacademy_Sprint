package testrunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		 features = "src/test/resources/Features/ExcelReport.feature",
		glue={"Stepdefination_ExcelReport", "apphooks"},
		plugin= {"pretty" ,
		"html:target/creport/cucumber",
		"json:target/creport/cucumber.json",
		 "junit:target/creport/cucumber.xml"}
		 )
public class TestRunner_ExcelReport extends AbstractTestNGCucumberTests {
  
}
