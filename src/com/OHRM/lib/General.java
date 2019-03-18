package com.OHRM.lib;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.Log;



public class General extends Gobal
{
	//public static Logger logger = Logger.getLogger("General");
	
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Seleniumworkspace\\Hybrid Framework\\driverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	public void teardown()
	{
		driver.quit();
}
	
	
	public void login()
	{
		//PropertyConfigurator.configure("log4j.properties");
		
		driver.findElement(By.id(username_element)).sendKeys(username_value);
		driver.findElement(By.id(password_element)).sendKeys(password_value);
		
		driver.findElement(By.id(Login_element)).click();
		 //logger.info("login successfully");
		 Log.info("test ");
	}
}

