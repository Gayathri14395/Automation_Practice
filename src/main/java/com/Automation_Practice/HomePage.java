package com.Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;

	@FindBy(xpath="//a[@class='login']")
	private WebElement signin_btn;

	public HomePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSignin_btn() {
		return signin_btn;
	}

}
