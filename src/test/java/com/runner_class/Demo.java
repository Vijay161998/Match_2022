package com.runner_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.base_class.Base_Class;

public class Demo extends Base_Class {

	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {

     driver = browser_Configuration("chrome");
     
	  driver.get("https://adactinhotelapp.com/");
		

		WebElement name =driver.findElement(By.id("username")); 
		inputValueElement(name,"VijayVijay11");
		
		WebElement pass =driver.findElement(By.id("password"));
		inputValueElement(pass,"5TTB54");
		
		WebElement login =driver.findElement(By.id("login"));
		clickOnElement(login);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//WebElement location = driver.findElement(By.id("location"));
		
		//selectByValue(location,"Melbourne");

		//WebElement hotel =driver.findElement(By.id("hotels"));
        
		//selectByValue(hotel,"Hotel Creek");
		
	}


	}

