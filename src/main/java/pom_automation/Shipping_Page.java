
package pom_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {

	public WebDriver driver;

	@FindBy(id="cgv")
	private WebElement check;

	public Shipping_Page(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}


	public WebElement getCheck_Out() {
		return check_Out;
	}

	public WebElement getCheck() {
		return check;
	}
	
	@FindBy(name="processCarrier")
	private WebElement check_Out;


}
