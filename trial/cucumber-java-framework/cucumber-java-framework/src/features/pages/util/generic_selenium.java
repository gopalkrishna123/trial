package features.pages.util;

import java.util.List;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
//import org.sikuli.script.FindFailed;
//import org.sikuli.script.Pattern;
//import org.sikuli.script.Screen;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import cucumber.api.Scenario;
import cucumber.api.java.After;




public class generic_selenium  {
	public static Logger log;
	
	

	 public void getlog(String ele)throws Exception
	 {
		log = Logger.getLogger(ele); 
	 }
	 
	 
	
//****************************************************************************************
	static WebDriver driver;
	 WebElement element;
	 
	 
	 
public WebDriver browser(String bro)throws Exception
{
	 DOMConfigurator.configure("log4j.xml");
	//String brow=load_config("Browser"); 
	if(bro.equals("firefox"))
	  driver= new FirefoxDriver();
	browser_max();
	return driver;
	//handling proxy setting using script
	//proxy();
	//maximizing the browser
	 
	}



//This method is used to open the given url
   public void open_application(String my_url) 
   {
		  //String my_url=load_config("url"); 
	   driver.navigate().to(my_url);   
	   //proxy();
   }
   
// Method to "maximize" the browser
    public void browser_max()
    {
 		  
 			   driver.manage().window().maximize();
 		   }   
    	
 
    /**
    * Embed a screenshot in test report if test is marked as failed
    */
    public void quitDriver(Scenario scenario) {
    
    if(scenario.isFailed()) {
    try {
    scenario.write("Current Page URL is " + driver.getCurrentUrl());
    byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    scenario.embed(screenshot, "image/png");
    } catch (WebDriverException somePlatformsDontSupportScreenshots) {
    System.err.println(somePlatformsDontSupportScreenshots.getMessage());
    }
    }
    
    }
	public void quit()
	{
		driver.close();
		
	}
	
	
}
