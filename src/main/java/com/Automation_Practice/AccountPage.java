package com.Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement email_id;
	
	@FindBy(xpath="(//input[@type='password'])")
	private WebElement pwd;	
	
	@FindBy(xpath="//button[@name='SubmitLogin']")
	private WebElement submit;
	

	public WebElement getSubmit() {
		return submit;
	}


		public WebElement getPwd() {
		return pwd;
	}


	public AccountPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail_id() {
		return email_id;
	}

}
