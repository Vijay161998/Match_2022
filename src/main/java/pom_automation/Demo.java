package pom_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base_class.Base_Class;

public class Demo extends Base_Class{
	
	public static void main(String[] args) throws Throwable {

		browser_Configuration("chrome");
		geturl("http://automationpractice.com/index.php");

		Sign_IN_Page a = new Sign_IN_Page(driver); 
		clickOnElement(a.getSignin_Btn());

		Login_Page b = new Login_Page(driver);

		inputValueElement(b.getEmail(), "ruvijay1998@gmail.com");

		inputValueElement(b.getPassword(), "Sachine@0130");

		clickOnElement(b.getSubmit_Btn());

		Dress_Selection dress = new Dress_Selection(driver);

		clickOnElement(dress.getDress());

		clickOnElement(dress.getSize());	

		clickOnElement(dress.getColor());	


		Actions find = new Actions(driver);
		WebElement add = driver.findElement(By.xpath("//img[@alt='Blouse']"));
		find.moveToElement(add).build().perform();

		clickOnElement(dress.getAddToCard());	

		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);

		//WebElement Check = driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
		clickOnElement(dress.getCheck());	
		
		Summary_Page summ = new Summary_Page(driver);

		//WebElement summ = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		clickOnElement(summ.getCheck_Out());	
       
		Address_Page address = new Address_Page(driver);
  
		//WebElement addr = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		clickOnElement(address.getCheck_Out());	


		WebElement che = driver.findElement(By.id("cgv"));
		clickOnElement(che);	


		WebElement shipp = driver.findElement(By.name("processCarrier"));
		clickOnElement(shipp);	

		WebElement pay = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		clickOnElement(pay);	

		WebElement order = driver.findElement(By.xpath("//span[text()='I confirm my order']"));
		clickOnElement(order);	
	}	
}

//

//Actions find = new Actions(driver);
//WebElement add = driver.findElement(By.xpath("//img[@alt='Blouse']"));
//find.moveToElement(add).build().perform();






