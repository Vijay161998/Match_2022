package pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class Invoice_Page {
	
	public WebDriver driver;
	
	@FindBy(id="my_itinerary")
	private WebElement invoice;

	public Invoice_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getInvoice() {
		return invoice;
	}
	

}
