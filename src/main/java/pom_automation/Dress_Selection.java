package pom_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Selection {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@ title ='Women']")
	private WebElement dress;
	
	public Dress_Selection(WebDriver driver2) {
	  	
	  this.driver = driver2;
	  
	  PageFactory.initElements(driver,this);
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddToCard() {
		return addToCard;
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getFind() {
		return find;
	}

	@FindBy(id="layered_id_attribute_group_1")
	private WebElement size;
	
	@FindBy(id="layered_id_attribute_group_8")
	private WebElement color;
	
	@FindBy(xpath="//a[@data-id-product='2']//ancestor::span[text()='Add to cart']")
	private WebElement addToCard;
	
	@FindBy(xpath="//span[normalize-space()='Proceed to checkout']")
	private WebElement check;
	
	@FindBy(xpath="//img[@alt='Blouse']")
	private WebElement find;
	
	
}
