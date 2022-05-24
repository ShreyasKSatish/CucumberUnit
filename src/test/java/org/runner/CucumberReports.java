package org.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;




public class CucumberReports {
	

public static void generatingJVMReport(String json) {
	
	//Location for storing our reports
	
	File file = new File("C:\\Users\\ajith\\eclipse-workspace\\CucumberUnit\\target");
	
	Configuration config = new Configuration(file, "Adactin");
	
	config.addClassifications("Browser", "Chrome");
	config.addClassifications("Platform", "Win-11");
	config.addClassifications("Version", "5.3.1");
	config.addClassifications("Environment", "UAT");
	
	List<String> li = new ArrayList<String>();
	li.add(json);
	
	ReportBuilder builder = new ReportBuilder(li, config);
	builder.generateReports();
	
}

}
