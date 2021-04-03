package com.Automation_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//a[text()='Dresses'])[2]")
	private WebElement Dress;
	
	@FindBy(xpath="(//a[text()='Evening Dresses'])[2]")
	private WebElement Eveningdress;
	
	@FindBy(xpath="//div[@class='product-image-container']")
	private WebElement product;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checkout;
	
	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getProduct() {
		return product;
	}

	@FindBy(xpath="//span[text()='Quick view']")
	private WebElement quickview;
	
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")
	private WebElement frame;
	
	@FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement increaseQty;
	
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(id="color_24")
	private WebElement color;
	
	@FindBy(xpath="(//button[@class='exclusive'])")
	private WebElement addtocart;

	public DressPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDress() {
		return Dress;
	}

	public WebElement getEveningdress() {
		return Eveningdress;
	}

	public WebElement getQuickview() {
		return quickview;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getIncreaseQty() {
		return increaseQty;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	
	
}
