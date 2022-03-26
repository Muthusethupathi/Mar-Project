package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser(String Browser) {
		if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		return driver;
		
	}

	public static void getUrl(String url) {
		driver.get(url);

	}
	
	public static void clickButton(WebElement element) {
		element.click();
	}
	
	public static void input(WebElement user, String value) {
		user.sendKeys(value);
	}
	
	public static void close() {
		
		driver.close();
	}
	
	
}
