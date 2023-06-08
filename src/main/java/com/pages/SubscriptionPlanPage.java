package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

import com.utility.Utility;

public class SubscriptionPlanPage extends Utility{
	@FindBy(xpath="(//*[text()='Get Plus'])")
	private WebElement GetPlusButton;
	//(//*[text()='Get Plus'])
	
	@FindBy(xpath="(//*[text()='Get Iconic'])")
	private WebElement GetIconicButton;
	//(//*[text()='Get Iconic'])
	
	@FindBy(xpath="(//*[text()='Checkout Centre'])")
	private WebElement CheckoutCentreButton ;
	//(//*[text()='Checkout Centre'])
	
	@FindBy(xpath="//button[@class='e1g0gkis6 aquilla-button button css-1uqqeul-StyledButton']")
	private WebElement GetPlusClickButton ;
	//(//button[@type='button'])[14]
	//*[text()='Get Plus']
	//button[@class='e1g0gkis6 aquilla-button button css-1uqqeul-StyledButton']
	

	@FindBy(xpath="//*[text()='Subscription plans']")
	private WebElement textElement ;
	//h1[@class='h1_variant aquilla-typography typography  css-1uhb9xi']
	
	
	public SubscriptionPlanPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	} 
	
	public String validateLandinPageTitle()
	{
		return driver.getTitle(); 
	} 
	
	public void GetPlusVisible()

    {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,1000)");
	    //executor.executeScript("arguments[0].scrollIntoView(true);", GetPlusButton);
		GetPlusButton.isDisplayed();
		System.out.println("GetPlus is visible");
    }
	
	public void GetIconicVisible()

    {
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("window.scrollBy(0,1000)");
//	    executor.executeScript("arguments[0].scrollIntoView(true);", GetIconicButton);
		GetIconicButton.isDisplayed();
		System.out.println("GetIconic is visible");
    }
	
	public void CheckoutCentreVisible()

  {
//		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("window.scrollBy(0,3000)");
//	    executor.executeScript("arguments[0].scrollIntoView(true);", CheckoutCentreButton);
		CheckoutCentreButton.isDisplayed();
		System.out.println("CheckoutCentre is visible");
    }
	public void GetPlusClicked()

    {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,1000)");
		//executor.executeScript("arguments[0].click();",GetPlusClickButton );
	    //executor.executeScript("arguments[0].scrollIntoView(true);", GetPlusClickButton);
	    GetPlusClickButton.click();
		System.out.println("Get plus is clicked");
    }
	
	public String textCapture()
	{
		return textElement.getText();
	}
	
	
	 
	
	
}
