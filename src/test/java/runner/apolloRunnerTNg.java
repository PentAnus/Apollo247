package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="features",
		glue="stepDefinition",
//		plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//		plugin={"pretty","json:target/cucumberReports.json"},
//		plugin={"pretty","junit:target/cucumberReports.xml"},
		dryRun=true)

public class apolloRunnerTNg extends AbstractTestNGCucumberTests{
  
}
