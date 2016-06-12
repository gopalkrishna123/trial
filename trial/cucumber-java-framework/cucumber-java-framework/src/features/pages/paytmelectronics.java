package features.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paytmelectronics{
	
	WebDriver d;
	public paytmelectronics(WebDriver d)
	 {
	   this.d = d;
	   //This initElements method will create  all WebElements
	   PageFactory.initElements(d, this);
	  } 
	

	 @FindBy(linkText = "ELECTRONICS")
	 public WebElement ELECTRONICS_link;
	 
	
	  public void click_ELECTRONICS() throws InterruptedException
	  {
	   ELECTRONICS_link.click(); 
	   Thread.sleep(7000);
	   
	    //d.quit();
	  }
	  public void show_Electronics()
		 {
		  if(ELECTRONICS_link.isDisplayed())
		   System.out.println("Electronics link is visible");
		  else
		   System.out.println("Electronics link is not visible");
		 }
	  
	 }
