package com.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProjectObiectManager {

	public static WebDriver driver;
	
	private LoginPage lp;

	

	public ProjectObiectManager(WebDriver driver1)
	{
		this.driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	public LoginPage getLp() {
		lp= new LoginPage(driver);
		return lp;
	}
	
	
	
	
}
