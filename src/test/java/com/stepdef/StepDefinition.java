package com.stepdef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;
import com.helperfile.FileReadManager;
import com.pojo.ProjectObiectManager;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base_Class {
	
	public static WebDriver driver=Base_Class.getBrowser("chrome");
	public static ProjectObiectManager pom = new ProjectObiectManager(driver);


	@Given("user is launch the application")
	public void user_is_launch_the_application() throws IOException {
	  // System.out.println("brower launch");
		getUrl(FileReadManager.getInstance_FRM().getInstance_co().getUrl());
	   
	}


	

	@When("enter the username in username field")
	public void enter_the_username_in_username_field() {
		// System.out.println("username is given");   
		input(pom.getLp().getUsername(), "muthusethupathi98@gmail.com");
	
	}
	@And("enter the password in password filed")
	public void enter_the_password_in_password_filed() {
	  //  System.out.println("password entered");
		input(pom.getLp().getPassword(), "12345678");
	    
	}
	@Then("click on Login button")
	public void click_on_login_button() {
	  //  System.out.println("login success");
		clickButton(pom.getLp().getLogin());
		
	}
	
}
