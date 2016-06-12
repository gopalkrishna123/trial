package features.stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.pages.paytmdatacardpage;
import features.pages.paytmelectronics;
import features.pages.util.generic_selenium;

public class paytmlanding extends generic_selenium {
	WebDriver d;
	WebElement ele;
	paytmdatacardpage paytmob;
	paytmelectronics paytmobj;
	
	 @Given("^I am on Paytm Landing page$")
	 public void I_am_on_paytm_landing_page()
	 {
	  d=new FirefoxDriver();
	  d.get("https://www.paytm.com");
	  d.manage().window().maximize();

	  
	 }
	 @Then("^I should verify Paytm Logo of the page$")
	 public void I_should_verify_paytm_logo_of_the_page()
	 {
	  ele=d.findElement(By.xpath("//*[@id='logo-bar']/div[1]/div[1]/a"));
	  if(ele.isDisplayed())
	  System.out.println("paytm logo is present");
	  else
	  System.out.println("paytm logi is not present");
	  
	 }
	 
	 @Then("^I should see DTH link on page$")
	 public void I_should_see_DTH_link_on_page()
	 {
	  ele=d.findElement(By.xpath("//*[@id='rechnav']/ul/li[2]/a/span"));
	  if(ele.isDisplayed())
	  System.out.println("DTH link is present");
	  else
	  System.out.println("DTH link is not present");
	  
	 }
	 
	/* @Then("^I should see DataCard link on page$")
	 public void I_should_see_DataCardlink_on_page()
	 {
	  ele=d.findElement(By.xpath("//div[2]/div/ul/li[3]/a/span"));
	  if(ele.isDisplayed())
	  System.out.println("DataCard link is present");
	  else
	  System.out.println("DataCard link is not present");
	  
	 }  */
	//-------------Cornetto Love Ka Recharge Offer----------------------------------
	 @Then("^I should see Cornetto Love Ka Recharge Offer link on page$")
	 public void I_should_see_CornettoLoveKaRechargeOffer_link_on_page()
	 {
	  ele=d.findElement(By.xpath("//li[9]/a/span"));
	  if(ele.isDisplayed())
	  System.out.println("Cornetto Love Ka Recharge Offer link is present");
	  else
	  System.out.println("Cornetto Love Ka Recharge Offer link is not present");
	  
	 }
	 @When("^I click on Cornetto Love Ka Recharge Offer link on page$")
	 public void I_click_on_CornettoLoveKaRechargeOffer_link_on_page()throws Throwable
	 {
	  d.findElement(By.xpath("//li[9]/a/span")).click();
	 }
	 @Then("^I should see Cornetto Love Ka Recharge Offer page is opened$")
	 public void I_should_see_CornettoLoveKaRechargeOffer_mode_is_opened() throws InterruptedException
	 {
	  String parentHandle = d.getWindowHandle();
	  d.findElement(By.xpath("//li[9]/a/span")).click();
	  for (String winHandle : d.getWindowHandles()) {
	   d.switchTo().window(winHandle); 
	  
	  }
	 String st=d.getCurrentUrl();
	 if(st.equals("https://paytm.com/cornetto"))
		 
	  System.out.println("Cornetto Love Ka Recharge Offe page is opened");
	 else
	  System.out.println("you are not in Cornetto Love Ka Recharge Offer page");
	 } 
//--------------------------Login/Sign Up-----------------------
		@When ("^I click on Log in/Sign Up link on page$")
		public void I_click_on_LoginSignUp_link() throws Throwable {
			d.findElement(By.linkText("Log In / Sign Up")).click();
			Thread.sleep(5000);
			
		}

		@And ("^I enters '7659083721' as username and 'kranthi216' as password on login page$")
	    public void I_enters_7659083721_as_username_and_kranthi216_as_password() throws Throwable {
			//d.findElement(By.id("middle-container")).click();
						Thread.sleep(2000);
			  for(String handle : d.getWindowHandles()) 
			  {
			  d.switchTo().window(handle);
			  }
			  Thread.sleep(2000);
			  d.findElement(By.xpath("//div[1]/input")).sendKeys("7659083721");
			  
			  
			  
			 }
			
			 
			 // d.findElement(By.id("middle-container")).click();
			//Thread.sleep(2000);
			//d.findElement(By.xpath("//div[1]/input")).sendKeys("7659083721");
		
	
			  /*d.findElement(By.id("mobileNumber")).sendKeys("7659083721");
			  d.findElement(By.id("password")).sendKeys("kranthi216");
			  d.findElement(By.xpath("//div[4]/button")).click(); */
			  
		
		@Then("^should sees the 'Hello Janga' message as a page header$")
		public void should_sees_the_Hello_Janga_message_as_a_page_header()
				throws Throwable {

		}
		// this is page object steps
		@Then("^I should see DataCard link on page$")
		public void I_should_see_DataCard_link_on_page() throws Throwable {
		  paytmob=new paytmdatacardpage(d);
		  paytmob.show_datacard();
		}

		@When("^I click on DataCard link on page$")
		public void I_click_on_DataCard_link_on_page() throws Throwable {
			paytmob=new paytmdatacardpage(d);
			  paytmob.click_datacard();  
		}
		@Then("^I should see Gas link on page$")
		 public void I_should_see_Gas_link_on_page() throws Throwable {
		   paytmob=new paytmdatacardpage(d);
		   paytmob.show_Gas();
		 }

		 @When("^I click on Gas link on page$")
		 public void I_click_on_Gas_link_on_page() throws Throwable {
		  paytmob=new paytmdatacardpage(d);
		    paytmob.click_Gas();  
		 }


		 @Then("^I should see Bus Tickets link on page$")
		 public void I_should_see_BusTickets_link_on_page() throws Throwable {
		   paytmob=new paytmdatacardpage(d);
		   paytmob.show_BusTickets();
		 }

		 @When("^I click on Bus Tickets link on page$")
		 public void I_click_on_BusTickets_link_on_page() throws Throwable {
		  paytmob=new paytmdatacardpage(d);
		    paytmob.click_BusTickets();  
		 }
		 @When("^I click on ELECTRONICS link$")
		 public void I_click_on_ELECTRONICS_link() throws Throwable {
			 paytmobj=new paytmelectronics(d);
			    paytmobj.click_ELECTRONICS(); 
		     
		    
		 }

		 @Then("^I should verify ELECTRONICS page is opened$")
		 public void I_should_verify_ELECTRONICS_page_is_opened() throws Throwable {
			 paytmobj=new paytmelectronics(d);
			    paytmobj.show_Electronics(); 
		     
		 }


		 
		 
}

