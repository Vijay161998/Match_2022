package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Time_Outs {

@Test(timeOut = 30000)	
	
private void login() {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\De\\eclipse-workspace\\Selenium\\Driver\\Driver1\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://automationpractice.com/index.php");
	
	driver.manage().window().maximize();
	
	WebElement sign = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
	sign.click();

	driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);

	
	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys("ruvijay1998@gmail.com");

	WebElement pass = driver.findElement(By.id("passwd"));
	pass.sendKeys("Sachine@0130");

	WebElement sum = driver.findElement(By.id("SubmitLogin"));
	sum.click();

}

}
