package com.Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebDriver driver;
	
	public WebElement getMailid() {
		return mailid;
	}

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement mailid;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement submitbtn;

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
}
