package features.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.pages.homepage;
import features.pages.paytmdatacardpage;
import features.pages.paytmelectronics;
import features.pages.util.generic_selenium;

public class homepagestepdef extends generic_selenium {
	WebDriver d;
	WebElement ele;
	
	homepage hm = new homepage();

@Given("^Iam on paytm LandingPage$")
public void Iam_on_paytm_LandingPage() throws Throwable {
	
hm.paytm();
  
}

@When("^I Click on login button$")
public void I_Click_on_login_button() throws Throwable {
	hm.Login();
   
}

@When("^I enter username and password$")
public void I_enter_username_and_password() throws Throwable {
   
}
@Then("^I should click on Mobile Link$")
public void I_should_click_on_Mobile_Link() throws Throwable {
   
}

@Then("^I should click on DTH Link$")
public void I_should_click_on_DTH_Link() throws Throwable {
    
}

@Then("^I should click on DataCard Link$")
public void I_should_click_on_DataCard_Link() throws Throwable {
   
}

@Then("^I should click on LandLine Link$")
public void I_should_click_on_LandLine_Link() throws Throwable {
    
}

@Then("^I should click on Electricity Link$")
public void I_should_click_on_Electricity_Link() throws Throwable {
    
}
}
