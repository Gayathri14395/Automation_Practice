package com.Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderStatus {

	public WebDriver driver;
	
	@FindBy(id="center_column")
	private WebElement orderstatus;
	
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logout;

	public OrderStatus(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getOrderstatus() {
		return orderstatus;
	}

	public WebElement getLogout() {
		return logout;
	}
	
}
