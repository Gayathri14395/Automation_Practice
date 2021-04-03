package com.Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchaseHomePage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement accountsignin;

	public PurchaseHomePage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAccountsignin() {
		return accountsignin;
	}

}
