package com.automation.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Automation_Practice.HomePage;
import com.Automation_Practice.LoginPage;
import com.Automation_Practice.PersonalInfoPage;

public class PageObjectManager {
	
	public WebDriver driver;
	
	private HomePage hp;
	private LoginPage lp;
	private PersonalInfoPage pip;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		}
	
	public HomePage getInstanceHome() {
		hp= new HomePage(driver);
		return hp;
			}
	
	public LoginPage getInstanceLogin() {
		lp=new LoginPage(driver);
		return lp;
		
	}
	
	public PersonalInfoPage getInstancePIP() {
		pip=new PersonalInfoPage(driver);
		return pip;
		
	
	}

	
}
