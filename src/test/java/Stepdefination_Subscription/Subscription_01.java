package Stepdefination_Subscription;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;

import com.aventstack.extentreports.Status;
import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import com.pages.HomePage;
import com.pages.LandingPage;
import com.pages.LoginPage;
import com.pages.SubscriptionPlanPage;
import com.utility.Utility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Subscription_01 extends Utility  {

	public LandingPage ldp;
	public LoginPage lp;
	public HomePage hp;
	public SubscriptionPlanPage sp;
	
	public void objectMethod() throws IOException {

		ldp = new LandingPage();
		lp = new LoginPage();
		hp=new HomePage();
		sp = new SubscriptionPlanPage();
		
	}

	@Given("Chrome is opened and unacademy app is opened")
	public void chrome_is_opened_and_unacademy_app_is_opened() throws IOException, InterruptedException {
		   
		objectMethod();
		Thread.sleep(2000);
		logger = report.createTest("test01");

        logger.log(Status.INFO, "Validating Landing Page");
        
		String actualtitle = ldp.validateLandinPageTitle();
		String expectedtitle = "Unacademy - India's largest learning platform"; 
		
		 try {
	            assertEquals(actualtitle, expectedtitle);
	            logger.log(Status.PASS, "Step1 is passed");
	            System.out.println(actualtitle);
	            assert true;
	        } catch (AssertionError e) {
	            e.printStackTrace();
	            logger.log(Status.FAIL, "Step1 is failed");
	            captureScreenshotOnFailure();
	            assert false;
	        }
		Utility.implicitWait();
	}
	
	@Then("User navigate onto Unacademy landing page")
	public void user_navigate_onto_unacademy_landing_page() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(2000);
		
        
		String actualtitle = ldp.validateLandinPageTitle();
		String expectedtitle = "Unacademy - India's largest learning platform"; 
//		assertEquals(expectedtitle, actualtitle);
//		System.out.println(actualtitle); 
//		//Thread.sleep(2000);
        
        try {
        	logger.log(Status.INFO, "Step 2is executed");
            assertEquals(actualtitle, expectedtitle);
            logger.log(Status.PASS, "Step1 is passed");
            System.out.println(actualtitle);
            assert true;
        } catch (AssertionError e) {
            e.printStackTrace();
            logger.log(Status.FAIL, "Step1 is failed");
            captureScreenshotOnFailure();
            assert false;
        }
	
		Utility.implicitWait();
	}
	
	@When("User click on login button")
	public void user_click_on_login_button() throws IOException, InterruptedException {
		objectMethod();
		lp = ldp.loginPageNavigation();
		//Thread.sleep(2000);
		Utility.implicitWait();
		logger.log(Status.INFO, "Step 3 is executed");
	}
	
	@Then("User Navigates onto login page")
	public void user_navigates_onto_login_page() throws IOException, InterruptedException {
		objectMethod();
		//Thread.sleep(2000);
		Utility.implicitWait();
		
		String actualtitle = lp.validateLandinPageTitle();
		String expectedtitle = "Unacademy - India's largest learning platform"; 
		assertEquals(expectedtitle, actualtitle);
		System.out.println(actualtitle); 
		logger.log(Status.INFO, "Step 4 is executed");
		//Thread.sleep(2000);
	}
	@When("user enter mobile number {string}")
	public void user_enter_mobile_number(String mn) throws IOException, InterruptedException {
		  objectMethod();

	       Thread.sleep(2000);
		 // Utility.implicitWait();

	        lp.loginmobilenumber(mn);

	        //System.out.println("mobile");
	        Thread.sleep(1000);
	        logger.log(Status.INFO, "Step 5 is executed");
	}
	@When("clicks on login button")
	public void clicks_on_login_button() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(2000);
        lp.LoginNavigation2();
        Thread.sleep(5000);
        logger.log(Status.INFO, "Step 6 is executed");
	}
	@When("User enter OTP")
	public void user_enter_otp() throws InterruptedException, IOException {
		
//		objectMethod();
//		Thread.sleep(20000);
//		lp.HomePageNavigation();
//        Thread.sleep(1000);
		logger.log(Status.INFO, "Step 7 is executed");
	   
	}
	@When("User click on verify OTP button")
	public void user_click_on_verify_otp_button() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(20000);
		lp.HomePageNavigation();
        Thread.sleep(5000);
        logger.log(Status.INFO, "Step 8 is executed");
	   
	    
	}
	@When("User click on Subscription Plan")
	public void user_click_on_subscription_plan() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(5000);
		hp.SubscriptionPlan();
        Thread.sleep(2000);
        logger.log(Status.INFO, "Step 9 is executed");
	}
	@Then("User navigates on Subscription page")
	public void user_navigates_on_subscription_page() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(2000);
		sp.validatePageTitle();
		Thread.sleep(8000);
		//sp.signout();
		logger.log(Status.INFO, "Step 10 is executed");
	}
	
	@Then("Subscription plan page fields are visible to User")
	public void subscription_plan_page_fields_are_visible_to_user() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(10000);
		sp.GetPlusVisible();
		sp.GetIconicVisible();
		sp.CheckoutCentreVisible();
      Thread.sleep(5000);
      // sp.signout();
       // Thread.sleep(5000);
      logger.log(Status.INFO, "Step 11 is executed");
	}

	@When("user click on Get Plus button")
	public void user_click_on_get_plus_button() throws IOException, InterruptedException {
		objectMethod();
		Thread.sleep(5000);
		sp.GetPlusClicked();
        Thread.sleep(2000);
        Utility.BackAction();
        Thread.sleep(2000);
        logger.log(Status.INFO, "Step 12 is executed");
	}
	
	@Then("Get Plus button is clickable and user navigates to Subscription plan duration page")
	public void get_plus_button_is_clickable_and_user_navigates_to_subscription_plan_duration_page() throws InterruptedException {
	   // Thread.sleep(3000);
		Utility.implicitWait();
	    logger.log(Status.INFO, "Step 13 is executed");
	    }

}
