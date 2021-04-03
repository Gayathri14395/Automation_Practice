package com.automation.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Automation_Practice.BaseClass;
import com.automation.helper.FileReaderManager;
import com.automation.helper.PageObjectManager;
import com.automation.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass {
	
	public static WebDriver driver= Test_Runner.driver;
	
	PageObjectManager pom = new PageObjectManager(driver);
	
	@Given("^user Launch The Application URL$")
	public void user_Launch_The_Application_URL() throws Throwable {
		String url = FileReaderManager.getInstance().getInstanceCR().getURL();
		toLaunchUrl(url);

	}

	@Then("^user Click The Sigin Button$")
	public void user_Click_The_Sigin_Button() throws Throwable {
		 toClick(pom.getInstanceHome().getSignin_btn());

	}

	@When("^user Enter The MailId #jiya(\\d+)@gmail\\.com$")
	public void user_Enter_The_MailId_jiya_gmail_com(int arg1) throws Throwable {
		   toEnterInput(pom.getInstanceLogin().getMailid(), "jiya14@gmail.com");

	}

	@Then("^user Click The Create An Account Button$")
	public void user_Click_The_Create_An_Account_Button() throws Throwable {
		toClick(pom.getInstanceLogin().getSubmitbtn());

	}

	@When("^user Select The Gender Button$")
	public void user_Select_The_Gender_Button() throws Throwable {
		toSleep();
	    toClick(pom.getInstancePIP().getGenderBtn());
	    toSleep();

	}

	@When("^user Enter The First Name$")
	public void user_Enter_The_First_Name() throws Throwable {
	    toEnterInput(pom.getInstancePIP().getFirstname(), "Jiya");

	}

	@When("^user Enter The Last Name$")
	public void user_Enter_The_Last_Name() throws Throwable {
	    toEnterInput(pom.getInstancePIP().getLastname(), "M");

	}

	@When("^user Enter The Password$")
	public void user_Enter_The_Password() throws Throwable {
	    toEnterInput(pom.getInstancePIP().getPwd(), "abc123");

	}

	@When("^user Select The Date From MultipleDropDown$")
	public void user_Select_The_Date_From_MultipleDropDown() throws Throwable {
	    toSelectByIndex(pom.getInstancePIP().getDays(), 5);

	}

	@When("^user Select The Month From MultipleDropDown$")
	public void user_Select_The_Month_From_MultipleDropDown() throws Throwable {
	    toSelectByValue(pom.getInstancePIP().getMonths(), "3");

	}

	@When("^user Select The Year From MultipleDropDown$")
	public void user_Select_The_Year_From_MultipleDropDown() throws Throwable {
	    toSelectByIndex(pom.getInstancePIP().getYears(), 7);

	}

	@When("^user Enter The Address$")
	public void user_Enter_The_Address() throws Throwable {
	    toEnterInput(pom.getInstancePIP().getAddress(), "Tambaram");

	}

	@When("^user Enter The City$")
	public void user_Enter_The_City() throws Throwable {
	    toEnterInput(pom.getInstancePIP().getCity(), "CHennai");

	}

	@When("^user Enter The State$")
	public void user_Enter_The_State() throws Throwable {
	    toEnterInput(pom.getInstancePIP().getState(), "TN");

	}

	@When("^user Enter The ZipCode$")
	public void user_Enter_The_ZipCode() throws Throwable {
	    toEnterInput(pom.getInstancePIP().getPc(), "12453");

	}

	@When("^user Enter The Mobile Phone$")
	public void user_Enter_The_Mobile_Phone() throws Throwable {
	    toEnterInput(pom.getInstancePIP().getPh(), "1234567891");

	}

	@When("^user Enter The MyAddress$")
	public void user_Enter_The_MyAddress() throws Throwable {
	    toEnterInput(pom.getInstancePIP().getMyadd(), "address");

	}

	@Then("^user Click The Register Button$")
	public void user_Click_The_Register_Button() throws Throwable {
		   toClick(pom.getInstancePIP().getRegister());

	}


	
	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	

	



}
