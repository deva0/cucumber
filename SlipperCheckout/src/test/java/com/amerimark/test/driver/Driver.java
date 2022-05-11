package com.amerimark.test.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.amerimark.test.constants.Constants;


public class Driver {
	public static WebDriver driver;
	public static Driver driverInstance;
	private Driver() {
	}
	public static Driver getInstance()
	{
		if(driverInstance==null)
		{
			driverInstance = new Driver();
		}
		return driverInstance;
	}
	public void browserLaunch() {
/*	public static WebDriver driver;
public void browserLaunch() {
	if(Constants.Browser.equals("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if(Constants.Browser.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}*/
	if(Constants.Browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", Constants.dLoc);
		driver = new FirefoxDriver();
		System.out.println("open firefox");
	
	}
	else if(Constants.Browser.equalsIgnoreCase("chrome")) {
		/* WebDriverManager.firefoxdriver().setup(); */
		System.setProperty("webdriver.gecko.driver", Constants.dLoc);
		driver = new ChromeDriver();
		System.out.println("open chrome");
	}
	else {
		System.out.println("hi");
		System.setProperty("webdriver.gecko.driver", Constants.dLoc);
		driver = new FirefoxDriver();
		System.out.println("open default firefox");
	}
}
	public static WebDriver getDriver() {
		return driver;
	}
}

