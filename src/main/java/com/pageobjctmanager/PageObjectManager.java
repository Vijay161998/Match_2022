package com.pageobjctmanager;

import org.openqa.selenium.WebDriver;

import pom_automation.Address_Page;
import pom_automation.Dress_Selection;
import pom_automation.Login_Page;
import pom_automation.Payment_page;
import pom_automation.Shipping_Page;
import pom_automation.Sign_IN_Page;
import pom_automation.Summary_Page;

public class PageObjectManager {

	public WebDriver driver;
	private Sign_IN_Page sign;
	private Login_Page login;
	private Dress_Selection dress;

	public PageObjectManager(WebDriver driver2) {

		this.driver = driver2;

	}

	public Sign_IN_Page getSign() {
		if (sign==null) {

			sign = new Sign_IN_Page(driver);
		}
		return sign;
	}
	public Login_Page getLogin() {
		if (login==null) {

			login = new Login_Page(driver);

		}
		return login;
	}
	public Dress_Selection getDress() {
		if (dress==null) {

			dress = new Dress_Selection(driver);

		}
		return dress;
	}
	public Summary_Page getSum() {
		if (sum==null) {

			sum = new Summary_Page(driver);
		}
		return sum;
	}
	public Address_Page getAddress() {
		if (address==null) {

			address = new Address_Page(driver);

		}
		return address;
	}
	public Payment_page getPayment() {
		if (payment==null) {

			payment = new Payment_page(driver);


		}
		return payment;
	}
	private Summary_Page sum;
	private Address_Page address;
	private Payment_page payment;
	private Shipping_Page shipping;

	public Shipping_Page getShipping() {
		if (shipping==null) {

			shipping = new Shipping_Page(driver);
		}
		return shipping;
	}

}
