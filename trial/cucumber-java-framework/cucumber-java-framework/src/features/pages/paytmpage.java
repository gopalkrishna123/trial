package features.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class paytmpage {
	@FindBy(linkText = "Login")
	public WebElement login_link;
	
	@FindBy(id="userlogin")
  public WebElement username;
	
	@FindBy(id="userpass")
	public WebElement password;
	
	@FindBy(id="logonButton")
	public WebElement loginbutton;
	
	

	public void mysearch(String st) {
		//search.sendKeys(st);
		
	}

	
	

}
