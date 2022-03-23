package pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;
	
	
	@FindBy(id="username")
    private WebElement user;	

	@FindBy(id="password")
    private WebElement password;	

	@FindBy(id="login")
    private WebElement login;

	public Login_Page(WebDriver driver2) {
	
		this.driver =driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDiver() {
		return driver;
	}

	public WebElement getUser() {
		return user;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}	

}
