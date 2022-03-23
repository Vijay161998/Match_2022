package pom_adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Details {
	
	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;

	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement numOfRoom;
	
	@FindBy(name="datepick_in")
	private WebElement checkIn;
	
	@FindBy(name="datepick_out")
	private WebElement checkOut;
	
	@FindBy(id="adult_room")
	private WebElement adut;
		
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(name="Submit")
	private WebElement search;

	public Hotel_Details(WebDriver driver2) {
	
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumOfRoom() {
		return numOfRoom;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdut() {
		return adut;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}
	
}
