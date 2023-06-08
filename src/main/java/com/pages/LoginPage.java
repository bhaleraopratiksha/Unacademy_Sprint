package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;
public class LoginPage extends Utility{

	//input[@placeholder='Enter your mobile number']
	//input[@aria-invalid='false']
	@FindBy(xpath="//input[@aria-invalid='false']")
	 WebElement MobileNumber;
	
	@FindBy(xpath="(//button[@type='button'])[6]")
	private WebElement loginButton2;
	//(//*[text()='Log in'])[2]
	//(//button[@type='button'])[6]
    //button[@class='ehkw11q4 aquilla-button button css-12mlfcu-SendOtp']
	
	@FindBy(xpath="//div[@class='eb5wfgq0 aquilla-otpinput-wrapper otpinput-wrapper css-1w10nvm-StyledOTPInput']")
	 WebElement otp;
	//div[@class='css-8cd3et-OTPInputWrapper eb5wfgq1']
	//div[@class='eb5wfgq0 aquilla-otpinput-wrapper otpinput-wrapper css-1w10nvm-StyledOTPInput']
	
	@FindBy(xpath="(//button[@type='button'])[6]")
	private WebElement verifyOtpButton;
	
	
	public LoginPage() throws IOException
	{
		PageFactory.initElements(driver, this);
	
	} 
	
	public String validateLandinPageTitle()
	{
		return driver.getTitle(); 
	} 
	
	public void loginmobilenumber(String mn)

    {
		MobileNumber.sendKeys(mn);

    }
	
	
	public void LoginNavigation2()

    {
		loginButton2.click();
		System.out.println("Clicked");

    }
//	public void EnterOtp(String otp2)

//    {

	
//    }
	
	
	public HomePage HomePageNavigation() throws IOException
	{
		verifyOtpButton.click();
		return new HomePage(); 
	}
	
}
