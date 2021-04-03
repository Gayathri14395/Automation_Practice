package com.automation.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;

	public Configuration_Reader() throws Throwable {

	File f = new File("C:\\Users\\welcome\\eclipse-workspace\\Automation_Practice\\src\\test\\java\\com\\automation\\properties\\configuration.properties");
	
	FileInputStream fis = new FileInputStream(f);
	
	p = new Properties();
	
	p.load(fis);
	
	}
	
	public String getBrowser() {
		String browser = p.getProperty("browser");
		return browser;
	}
	
	public String getURL() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getMailid() {
		String mailid = p.getProperty("mailid");
		return mailid;
	}
	
}
