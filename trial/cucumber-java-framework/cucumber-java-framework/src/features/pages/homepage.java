package features.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class homepage {
	WebDriver d;
	
   public void paytm(){
		  d=new FirefoxDriver();
		  d.get("https://www.paytm.com");
		  d.manage().window().maximize();

		
		
	} 
   public void Login(){
	   
   }

}
