package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utility.Utility;
public class LandingPage extends Utility{


	//@FindBy(xpath="//span[text()='Log In']")
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement loginButton; 
	
	
	public LandingPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	} 
	
	public String validateLandinPageTitle()
	{
		return driver.getTitle(); 
	} 
	
	
	public LoginPage loginPageNavigation() throws IOException
	{
		loginButton.click();
		return new LoginPage(); 
	}
	
	
	
}
