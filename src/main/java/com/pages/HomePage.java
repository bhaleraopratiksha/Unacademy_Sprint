package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class HomePage extends Utility  {
	@FindBy(xpath="(//*[text()='Subscription plan'])[2]")
	private WebElement SubscriptionPlanButton;
	//(//*[text()='Subscription plan'])
	
//	@FindBy(xpath="(//a[@class=' aquilla-tab tab activetab css-124mipd'])[2]")
//	private WebElement SubscriptionPlanButton;
	
	WebElement signoutButton;
	
	public HomePage() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	} 
	
	
	public String validateLandinPageTitle()
	{
		return driver.getTitle(); 
	} 
	public SubscriptionPlanPage  SubscriptionPlan() throws IOException
	{
		SubscriptionPlanButton.click();
		System.out.println("Clicked");
		return new SubscriptionPlanPage(); 
		
	}

}
