package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class ReferralCode  extends Utility{

	
	@FindBy(xpath="//input[@class='MuiInputBase-input MuiOutlinedInput-input']")
	private WebElement ReferralCode ;
	//input[@type='text']
	//input[@class='MuiInputBase-input MuiOutlinedInput-input']
	
	@FindBy(xpath="//div[@class='MuiInputAdornment-root MuiInputAdornment-positionEnd']")
	private WebElement ApplyLink;
	//h6[text()='Apply']
	//div[@class='MuiInputAdornment-root MuiInputAdornment-positionEnd']
	//h6[@class='css-kpxdhx-H6-Apply egso1ul2']
	
	@FindBy(xpath="(//*[text()='Awesome! You got 5% off'])")
	private WebElement OfferMessage;
	//(//*[text()='Awesome! You got 5% off'])
	
	@FindBy(xpath="//p[@role='referral-message-invalid']")
	private WebElement OfferMessageinvalid;
	//p[text()='This code is invalid. Please use SAVE5 to get 5% off.']
	//*[text()='This code is invalid. Please use SAVE5 to get 5% off.']
	//p[@class='css-g1q3b4-StyledP2 etr0e9l12']
	//*[text()='This code is invalid. please use SAVE5 to get 5% off.']
	//p[@role='referral-message-invalid']
	
	public ReferralCode() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	} 
	
	public String validateLandinPageTitle()
	{
		return driver.getTitle(); 
	} 
	
	public void EnterReferralCode(String RC)
	{
		ReferralCode.sendKeys(RC);
		
	}
	
	public void ClickApply()
	{
		
		ApplyLink.click();	
		System.out.println("Apply is Clicked..");
	}
	public void OfferVisible()

	{
		OfferMessage.isDisplayed();
		System.out.println(OfferMessage);
    }
	
	public void EnterReferralCodeInvalid(String RC)
	{
		ReferralCode.sendKeys(RC);
		
	}
	
	public void ClickApplyInvalid()
	{
		
		ApplyLink.click();	
		System.out.println("Apply is Clicked..");
	}
	public void OfferVisibleInvalid()

	{
		OfferMessageinvalid.isDisplayed();
		System.out.println("This code is invalid. Please use SAVE5 to get 5% off.");
		
    }
	
}
