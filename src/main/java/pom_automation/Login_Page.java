package pom_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;	
	
	@FindBy(id="email")
	private WebElement email;


	@FindBy(id="passwd")
	private WebElement password;

	@FindBy(id="SubmitLogin")
	private WebElement submit_Btn;

	public Login_Page(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver,this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit_Btn() {
		return submit_Btn;
	}

}
