package com.Automation_Practice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class signIn {
	
	public static void main(String[] args) throws Throwable
	
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement sign_in = driver.findElement(By.xpath("//a[@class='login']"));
		
		sign_in.click();
		
		WebElement entermailid = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		entermailid.sendKeys("jiya4@gmail.com");
		
		WebElement submit_btn = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		submit_btn.click();

		Thread.sleep(5000);
		
		WebElement gender_btn = driver.findElement(By.xpath("//div[@id='uniform-id_gender2']"));				

		gender_btn.click();		
		
		Thread.sleep(5000);
					
		WebElement enterfname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));		
		
		enterfname.sendKeys("Gayathri"); 		
		
		Thread.sleep(2000);
		
		WebElement enterlname = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		
		enterlname.sendKeys("M"); 
		
		Thread.sleep(2000);
		
		WebElement enterpwd = driver.findElement(By.xpath("(//input[@type='password'])"));
		
		enterpwd.sendKeys("akshith");
		
		Thread.sleep(2000);
		
		WebElement daysdd = driver.findElement(By.id("days"));
		
		Select s = new Select(daysdd);
		
		s.selectByValue("29");
		
		Thread.sleep(2000);
		
		WebElement months = driver.findElement(By.id("months"));

		Select s1 = new Select((WebElement) months);
		
		s1.selectByValue("3");
		
		Thread.sleep(2000);
		
		WebElement years = driver.findElement(By.id("years"));
		
		Select s2 = new Select(years);
		
		s2.selectByIndex(2);
		
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		
		address.sendKeys("Tambaram");
		
		Thread.sleep(2000);
		
		WebElement city = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		
		city.sendKeys("Chennai");
		
		Thread.sleep(2000);
		
		WebElement state = driver.findElement(By.id("id_state"));
		
		Select s3 = new Select(state);
		
		s3.selectByValue("29");
		
		Thread.sleep(2000);
		
		WebElement postcode = driver.findElement(By.id("postcode"));
		
		postcode.sendKeys("03087");
		
		Thread.sleep(2000);
		
		WebElement ph = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
		
		ph.sendKeys("1234567890");
		
		Thread.sleep(2000);		
		
		WebElement myadd = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		
		myadd.clear();		
		
		Thread.sleep(2000);
		
		myadd.sendKeys("India");
		
		Thread.sleep(2000);
		
		WebElement register = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		register.click();		
			
		Thread.sleep(2000);
		
		WebElement logout = driver.findElement(By.xpath("//a[@class='logout']"));
		
		logout.click();		
		
		Thread.sleep(2000);
		
WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		
		login.click();
		
		WebElement email_id = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		
		email_id.sendKeys("abc@gmail.com");
		
		WebElement pwd = driver.findElement(By.xpath("(//input[@type='password'])"));
		
		pwd.sendKeys("123456");
		
		WebElement submit = driver.findElement(By.xpath("//button[@name='SubmitLogin']"));
		
		submit.click();
		
		WebElement Drs = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		
		Actions a = new Actions(driver);
		
		a.moveToElement(Drs).build().perform();;
		
		WebElement edr = driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]"));
		
		edr.click();
		
		WebElement pdr = driver.findElement(By.xpath("//div[@class='product-image-container']"));
		
		a.moveToElement(pdr).build().perform();
		
		Thread.sleep(3000);
		
		WebElement qview = driver.findElement(By.xpath("//span[text()='Quick view']"));
		
		qview.click();
		
		Thread.sleep(3000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		
		driver.switchTo().frame(frame);
		
		Thread.sleep(3000);
			
		WebElement incqty = driver.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
				
		incqty.click();
		
		Thread.sleep(3000);
		
		WebElement size = driver.findElement(By.id("group_1"));
		
		Select ss = new Select(size);
		
		ss.selectByValue("3"); 
		
		Thread.sleep(3000);
		
		WebElement color = driver.findElement(By.id("color_24"));
		
		color.click(); 
		
		Thread.sleep(3000);
		
		WebElement addtocart = driver.findElement(By.xpath("(//button[@class='exclusive'])"));
		
		addtocart.click(); 
		
		Thread.sleep(3000);
		
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		
		checkout.click();		
		
		Thread.sleep(3000);
		
		WebElement proceed = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		
		proceed.click();
		
		Thread.sleep(3000);
		
		WebElement to = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		to.click(); 
		
		Thread.sleep(3000);
		
		WebElement check = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		check.click(); 
		
		Thread.sleep(3000);
		
		WebElement close = driver.findElement(By.xpath("//a[@title='Close']"));
		
		close.click(); 
		
		Thread.sleep(3000);
		
		WebElement TC = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		TC.click(); 
		
		Thread.sleep(3000);
		
		check.click(); 
		
		Thread.sleep(3000);
		
		WebElement pay = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		
		pay.click(); 
		
		Thread.sleep(3000);
		
		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		confirm.click();
		
		Thread.sleep(3000);	
		
		WebElement ts2 = driver.findElement(By.id("center_column"));
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		
		js1.executeScript("arguments[0].scrollIntoView();",ts2);
		
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		File destiny = new File("C:\\Users\\welcome\\eclipse-workspace\\Mini_Project\\src\\Screenshot\\snap.png");
		
		FileUtils.copyFile(source, destiny);
		
		Thread.sleep(3000);
		
		WebElement back = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		
		back.click();
		
		Thread.sleep(3000);
		
		WebElement ts1 = driver.findElement(By.id("center_column"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView();",ts1);
						
		Thread.sleep(3000);
		
		File sour = ts1.getScreenshotAs(OutputType.FILE);
		
		File des = new File("C:\\Users\\welcome\\eclipse-workspace\\Mini_Project\\src\\Screenshot\\snap1.png");
		
		FileUtils.copyFile(sour, des);

		Thread.sleep(3000);
				
		WebElement signout = driver.findElement(By.xpath("//a[@class='logout']"));
		
		signout.click();		
		
			}		
		
	}


