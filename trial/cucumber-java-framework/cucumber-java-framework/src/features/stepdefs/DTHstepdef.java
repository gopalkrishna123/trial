package features.stepdefs;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.pages.DTH;
import features.pages.homepage;

public class DTHstepdef {
	
	DTH link = new DTH();
	homepage h1= new homepage();
@When("^i click on DTH link on paytm Landingpage$")
public void i_click_on_DTH_link_on_paytm_Landingpage() throws Throwable {

	link.DTHlink();
	
}

@Then("^i can see DTH page$")
public void i_can_see_DTH_page() throws Throwable {
    
}
}

