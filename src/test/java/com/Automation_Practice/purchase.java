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


public class purchase {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?");
		
		driver.manage().window().maximize();
		
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
		
		Select s = new Select(size);
		
		s.selectByValue("3"); Thread.sleep(3000);
		
		WebElement color = driver.findElement(By.id("color_24"));
		
		color.click(); Thread.sleep(3000);
		
		WebElement addtocart = driver.findElement(By.xpath("(//button[@class='exclusive'])"));
		
		addtocart.click(); Thread.sleep(3000);
		
		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		
		checkout.click();
		
		
		Thread.sleep(3000);
		
		WebElement proceed = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		
		proceed.click();
		
		Thread.sleep(3000);
		
		WebElement to = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		to.click(); Thread.sleep(3000);
		
		WebElement check = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
		check.click(); Thread.sleep(3000);
		
		WebElement close = driver.findElement(By.xpath("//a[@title='Close']"));
		
		close.click(); Thread.sleep(3000);
		
		WebElement TC = driver.findElement(By.xpath("//input[@type='checkbox']"));
		
		TC.click(); Thread.sleep(3000);
		
		check.click(); Thread.sleep(3000);
		
		WebElement pay = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		
		pay.click(); Thread.sleep(3000);
		
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
