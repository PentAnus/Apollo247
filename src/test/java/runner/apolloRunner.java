package runner;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="stepDefinition",
		plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
//		plugin="")

public class apolloRunner {

}
