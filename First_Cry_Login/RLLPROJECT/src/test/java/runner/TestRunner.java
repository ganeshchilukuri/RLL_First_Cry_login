package runner;

import org.testng.annotations.Listeners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ItestListenerclass;
@CucumberOptions(features ="src/test/resources/features",glue = {"stepdefinitations"},
plugin = {"pretty","html:target/cucumber-reports/cucumber-preety",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:\", \"timeline:test-output-thread/" }

)

@Listeners(ItestListenerclass.class)
public class TestRunner extends   AbstractTestNGCucumberTests{

	}


	


