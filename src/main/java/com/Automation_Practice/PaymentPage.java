package com.Automation_Practice;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
		public WebDriver driver;
		
		@FindBy(xpath="//a[@title='Pay by bank wire']")
		private WebElement payby;

		public PaymentPage(WebDriver driver2) {
			this.driver=driver2;
			PageFactory.initElements(driver,this);
		}

		public WebElement getPayby() {
			return payby;
		}


}
