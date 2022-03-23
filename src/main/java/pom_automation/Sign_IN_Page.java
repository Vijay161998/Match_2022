package pom_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_IN_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement Signin_Btn;
	
	

	public Sign_IN_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}


	public WebElement getSignin_Btn() {
		return Signin_Btn;
	}

}
