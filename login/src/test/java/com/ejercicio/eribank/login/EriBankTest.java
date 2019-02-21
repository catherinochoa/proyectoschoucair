package com.ejercicio.eribank.login;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EriBankTest {


	WebDriver driver;
	
		
	@Before
	  public void setUp() throws Exception {
	    DesiredCapabilities capacidades = new DesiredCapabilities();
	    
	    capacidades.setCapability("deviceName", "Custom Phone");
	    capacidades.setCapability("platformName", "android");
	    capacidades.setCapability("VERSION", "4.1");
	    capacidades.setCapability("appPackage", "com.experitest.ExperiBank");
	    capacidades.setCapability("appActivity", "LoginActivity");
		   
	    try {
	        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capacidades);
	    } catch (Exception e){
	    	  System.out.println(e.toString());
	    	}
	 }
	
	 @Test
	  public void Test() throws Exception {
	   driver.findElement(By.id("com.experitest.ExperiBank:id/usernameTextField")).sendKeys("company");
	   driver.findElement(By.id("com.experitest.ExperiBank:id/passwordTextField")).sendKeys("company");
	   driver.findElement(By.id("com.experitest.ExperiBank:id/loginButton")).click();
	   driver.findElement(By.id("com.experitest.ExperiBank:id/logoutButton")).click();
	  }


	 @After
	  public void tearDown() {
		  try {
	    driver.quit();
		  } catch (Exception e) {
			  System.out.println(e.toString());
		  }
	  }
}
