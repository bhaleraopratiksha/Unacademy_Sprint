package Stepdefination_Subscription_02;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.pages.ReferralCode;
import com.pages.SubscriptionPlanPage;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Subscription_02 extends Utility {
	
	public LandingPage ldp;
	public LoginPage lp;
	public HomePage hp;
	public SubscriptionPlanPage sp;
	public ReferralCode rc;
	
	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		lp = new LoginPage();
		hp=new HomePage();
		sp = new SubscriptionPlanPage();
		rc=new ReferralCode();
		
	}

@Given("Chrome is opened and unacademy app is opened")
public void chrome_is_opened_and_unacademy_app_is_opened() throws IOException, InterruptedException {
	objectMethod();
	//Thread.sleep(2000);
	Utility.implicitWait();
	String actualtitle = ldp.validateLandinPageTitle();
	String expectedtitle = "Unacademy - India's largest learning platform"; 
	assertEquals(expectedtitle, actualtitle);
	System.out.println(actualtitle); 
	//Thread.sleep(2000);
	Utility.implicitWait();
}
@Then("User navigate onto Unacademy landing page")
public void user_navigate_onto_unacademy_landing_page() throws IOException, InterruptedException {
	objectMethod();
	Thread.sleep(2000);
	String actualtitle = ldp.validateLandinPageTitle();
	String expectedtitle = "Unacademy - India's largest learning platform"; 
	assertEquals(expectedtitle, actualtitle);
	System.out.println(actualtitle); 
	//Thread.sleep(2000);
	Utility.implicitWait();
}
@When("User click on login button")
public void user_click_on_login_button() throws IOException, InterruptedException {
	objectMethod();
	lp = ldp.loginPageNavigation();
	Thread.sleep(2000);
    
}
@Then("User Navigates onto login page")
public void user_navigates_onto_login_page() throws IOException, InterruptedException {
	objectMethod();
	Thread.sleep(2000);
	String actualtitle = lp.validateLandinPageTitle();
	String expectedtitle = "Unacademy - India's largest learning platform"; 
	assertEquals(expectedtitle, actualtitle);
	System.out.println(actualtitle); 
	//Thread.sleep(2000);
}
@When("user enter mobile number")
public void user_enter_mobile_number() throws IOException, InterruptedException {
   
	objectMethod();
	Thread.sleep(5000);
     lp.loginmobilenumber("8805486052");

    //System.out.println("mobile");
    Thread.sleep(1000);
}
@When("clicks on login button")
public void clicks_on_login_button() throws IOException, InterruptedException {
    
	objectMethod();
	Thread.sleep(2000);
    lp.LoginNavigation2();
    Thread.sleep(5000);
}
@When("User enter OTP")
public void user_enter_otp() throws InterruptedException, IOException {
//   Thread.sleep(2000);
//   objectMethod();
   
}
@When("User click on verify OTP button")
public void user_click_on_verify_otp_button() throws IOException, InterruptedException {
	objectMethod();
	Thread.sleep(20000);
	lp.HomePageNavigation();
    Thread.sleep(5000);
    
}
@When("User click on Subscription Plan")
public void user_click_on_subscription_plan() throws IOException, InterruptedException {
 
	objectMethod();
	Thread.sleep(5000);
	hp.SubscriptionPlan();
    Thread.sleep(2000);
}
@Then("User navigates on Subscription page")
public void user_navigates_on_subscription_page() throws InterruptedException, IOException {
	objectMethod();
	Thread.sleep(2000);

	String actualText=sp.textCapture();
	String expectedText="Subscription plans";
	assertEquals(expectedText,actualText);
	System.out.println("Actual Text is" +actualText);
	Thread.sleep(2000);
	
}
@When("user click on Get Plus button")
public void user_click_on_get_plus_button() throws IOException, InterruptedException {
	objectMethod();
	Thread.sleep(5000);
	sp.GetPlusClicked();
    Thread.sleep(2000);
    
}
@Then("Get Plus button is clickable and user navigates to Subscription plan duration page")
public void get_plus_button_is_clickable_and_user_navigates_to_subscription_plan_duration_page() throws IOException, InterruptedException {
	objectMethod();
	Thread.sleep(2000);
	String actualtitle = ldp.validateLandinPageTitle();
	String expectedtitle = "Unacademy - India's largest learning platform";
	assertEquals(expectedtitle, actualtitle);
	System.out.println(actualtitle); 
	Thread.sleep(2000);
}
//@When("user enter data in Referral code field<Refferal code>")
//public void user_enter_data_in_referral_code_field_refferal_code() throws IOException, InterruptedException {


//@When("user enter data in Referral code field\"SAVE5\"")
//public void user_enter_data_in_referral_code_field_save5() throws IOException, InterruptedException {

@When("user enter data in Referral code field {string}")
public void user_enter_data_in_referral_code_field(String RC) throws InterruptedException, IOException {
   

	objectMethod();
	Thread.sleep(2000);
	rc.EnterReferralCode(RC);
    Thread.sleep(2000);
    
}
@When("click on Apply button")
public void click_on_apply_button() throws IOException, InterruptedException {
	objectMethod();
	Thread.sleep(2000);
	rc.ClickApply();
    Thread.sleep(10000);
}
@Then("User should see the Offer Message")
public void user_should_see_the_offer_message() throws IOException, InterruptedException {
	objectMethod();
	Thread.sleep(2000);
	rc.OfferVisible();
    Thread.sleep(500);
    Utility.BackAction();
    Thread.sleep(6000);
}


//
//@When("user enter data in invalid Referral code field\"abcd3\"")
//public void user_enter_data_in_invalid_referral_code_field_abcd3() throws IOException, InterruptedException {
@When("user enter data in invalid Referral code field {string}")
public void user_enter_data_in_invalid_referral_code_field(String RC) throws IOException, InterruptedException {
	objectMethod();
	Thread.sleep(2000);
	rc.EnterReferralCodeInvalid(RC);
	Thread.sleep(2000);
	
}

@When("click on Apply button for check Invalid data")
public void click_on_apply_button_for_check_invalid_data() throws IOException, InterruptedException {
   
	objectMethod();
	Thread.sleep(2000);
	rc.ClickApplyInvalid();
    Thread.sleep(5000);
}

@Then("User should  see Message that This code is invalid")
public void user_should_see_message_that_this_code_is_invalid() throws IOException, InterruptedException {
	objectMethod();
	
	//Thread.sleep(2000);
	rc.OfferVisibleInvalid();
   Thread.sleep(2000);
   Utility.BackAction();
   Thread.sleep(6000);
   Utility.implicitWait();
}

}
