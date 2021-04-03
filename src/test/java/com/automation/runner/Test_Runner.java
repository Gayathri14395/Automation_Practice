package com.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Automation_Practice.BaseClass;
import com.automation.helper.FileReaderManager;

import cucumber.api.CucumberOptions; 
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java/com//automation//feature", glue="com.automation.stepdefinition",monochrome=true)

public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Throwable {

		String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		driver=BaseClass.toLaunchBrowser(browser);
	}
	
	@AfterClass
	public static void tearDown() throws Throwable {

		BaseClass.toSleep();
		BaseClass.toClose();
	}	

}
