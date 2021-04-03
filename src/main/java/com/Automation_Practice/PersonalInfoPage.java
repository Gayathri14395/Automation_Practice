package com.Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfoPage {

	public WebDriver driver;
	
	@FindBy(xpath="(//input[@id='id_gender2'])")
	private WebElement genderBtn;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstname;
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement lastname;
	
	@FindBy(xpath = "(//input[@type='password'])")
	private WebElement pwd;
	
	@FindBy(id="days")
	private WebElement days;
	
	@FindBy(id="months")
	private WebElement months;
	
	@FindBy(id="years")
	private WebElement years;
	
	@FindBy(xpath = "(//input[@type='text'])[8]")
	private WebElement address;
	
	@FindBy(xpath = "(//input[@type='text'])[10]")
	private WebElement city;
	
	@FindBy(id="id_state")
	private WebElement state;
	
	@FindBy(id = "postcode")
	private WebElement pc;
	
	@FindBy(xpath="(//input[@type='text'])[13]")
	private WebElement ph;
	
	@FindBy(xpath="(//input[@type='text'])[14]")
	private WebElement myadd;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement register;

	public PersonalInfoPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getGenderBtn() {
		return genderBtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getDays() {
		return days;
	}

	public WebElement getMonths() {
		return months;
	}

	public WebElement getYears() {
		return years;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPc() {
		return pc;
	}

	public WebElement getPh() {
		return ph;
	}

	public WebElement getMyadd() {
		return myadd;
	}

	public WebElement getRegister() {
		return register;
	}
	
	
	
}
