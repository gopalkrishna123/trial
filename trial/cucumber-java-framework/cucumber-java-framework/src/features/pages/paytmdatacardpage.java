package features.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class paytmdatacardpage {
 
 WebDriver d;
 public paytmdatacardpage(WebDriver d)
 {
   this.d = d;
   //This initElements method will create  all WebElements
   PageFactory.initElements(d, this);
  } 
 @FindBy(linkText = "DataCard")
 public WebElement Datacard_link;
 
 public void show_datacard()
 {
  if(Datacard_link.isDisplayed())
   System.out.println("Datacard link is visible");
  else
   System.out.println("Datacard link is not visible");
  
  
 }
 public void click_datacard()
 {
   Datacard_link.click(); 
  
   d.quit();
 }
 
 @FindBy(linkText = "Gas")
 public WebElement Gas_link;
 
  public void show_Gas()
 {
  if(Datacard_link.isDisplayed())
   System.out.println("Gas link is visible");
  else
   System.out.println("Gas link is not visible");
  
  
 }
 public void click_Gas()
 {
   Gas_link.click(); 
   d.quit();
 }
 
 @FindBy(linkText = "Bus Tickets")
 public WebElement BusTickets_link;
 
  public void show_BusTickets()
 {
  if(BusTickets_link.isDisplayed())
   System.out.println("Bus Tickets link is visible");
  else
   System.out.println("Bus Tickets link is not visible");
  
  
 }
 public void click_BusTickets()
 {
  BusTickets_link.click(); 
   d.quit();
 }
 
}