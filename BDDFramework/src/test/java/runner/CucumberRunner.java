package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"./src/test/java/features"},
glue = {"stepDefinition","hook"},
//tags="@Smoke and @Regression",
dryRun = false,
plugin= {"html:Reports/CucumberReports.html",
		"json:Reports/CucumberJSONReport.json",
		//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})
public class CucumberRunner extends AbstractTestNGCucumberTests  {

}
