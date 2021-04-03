package com.Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement checkout;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkbox;
	

	public WebElement getCheckbox() {
		return checkbox;
	}

	public ShippingPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getCheckout() {
		return checkout;
	}
	

}
