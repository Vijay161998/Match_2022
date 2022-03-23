package pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Booking {
	
	public WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement fn;

	@FindBy(id="last_name")
	private WebElement la;

	public Hotel_Booking(WebDriver driver2) {
	
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLa() {
		return la;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcNum() {
		return ccNum;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getMon() {
		return mon;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	@FindBy(id="address")
	private WebElement address;

	@FindBy(id="cc_num")
	private WebElement ccNum;

	@FindBy(id="cc_type")
	private WebElement ccType;

	@FindBy(id="cc_exp_month")
	private WebElement mon;

	@FindBy(id="cc_exp_year")
	private WebElement year;

	@FindBy(id="cc_cvv")
	private WebElement ccv;

	@FindBy(id="book_now")
	private WebElement bookNow;

}

