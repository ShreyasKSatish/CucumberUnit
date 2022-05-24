package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ajith\\eclipse-workspace\\CucumberUnit\\src\\test\\resources\\Task.feature",
glue = "org.stepdef", monochrome=true, dryRun = false, plugin = {"pretty", 
		"html:C:\\Users\\ajith\\eclipse-workspace\\CucumberUnit\\src\\test\\resources\\Reports",
		"json:C:\\Users\\ajith\\eclipse-workspace\\CucumberUnit\\src\\test\\resources\\Reports\\sample.json",
		"junit:C:\\Users\\ajith\\eclipse-workspace\\CucumberUnit\\src\\test\\resources\\Reports\\sample.xml"},
strict = true, snippets = SnippetType.CAMELCASE)


public class TestRunner {

	@AfterClass
public static void afterClass() {
		CucumberReports.generatingJVMReport("C:\\\\Users\\\\ajith\\\\eclipse-workspace\\\\CucumberUnit\\\\src\\\\test\\\\resources\\\\Reports\\\\sample.json");
		
	}
}
