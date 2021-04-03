package com.Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistory {
	
	public WebDriver driver;
	
	@FindBy(id="center_column")
	private WebElement scroll;
	
	@FindBy(xpath="//a[@title='Back to orders']")
	private WebElement backtoorder;

	public OrderHistory(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getScroll() {
		return scroll;
	}

	public WebElement getBacktoorder() {
		return backtoorder;
	}
	

}
