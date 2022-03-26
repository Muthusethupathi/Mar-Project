package com.automation_pratice;


import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.helperfile.FileReadManager;
import com.pojo.ProjectObiectManager;

public class Fb_Login extends Base_Class {
	
	public static WebDriver driver=Base_Class.getBrowser("chrome");
	public static ProjectObiectManager pom = new ProjectObiectManager(driver);

public static void main(String[] args) throws  IOException, InterruptedException {
	
		
		//getUrl("https://www.facebook.com/");
		getUrl(FileReadManager.getInstance_FRM().getInstance_co().getUrl());
		
		
		input(pom.getLp().getUsername(), "muthusethupathi98@gmail.com");
		input(pom.getLp().getPassword(), "12345678");
		clickButton(pom.getLp().getLogin());
		
		Thread.sleep(3000);
		
		close();
		
	}
}
