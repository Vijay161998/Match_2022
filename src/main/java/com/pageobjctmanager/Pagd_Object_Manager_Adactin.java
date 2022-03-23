package com.pageobjctmanager;

import org.apache.commons.math3.ml.neuralnet.twod.util.HitHistogram;
import org.openqa.selenium.WebDriver;

import pom_adactin.Hotel_Booking;
import pom_adactin.Hotel_Details;
import pom_adactin.Hotel_Selection;
import pom_adactin.Invoice_Page;
import pom_adactin.Login_Page;

public class Pagd_Object_Manager_Adactin {
	
	public WebDriver driver;
	
	private Login_Page log;
	
	private Hotel_Details hd;
	
	private Hotel_Booking hb;
	
	private Hotel_Selection hs;
	
	private Invoice_Page ip;

	public Pagd_Object_Manager_Adactin(WebDriver driver2) {
	
		this.driver =driver2;
	
	}

	public WebDriver getDriver() {
		
		return driver;
	}

	public Login_Page getLog() {
		
		if (log==null) {
			
		log=new Login_Page(driver);
		}
		return log;
	}

	public Hotel_Details getHd() {
		
		if (hd==null) {
		
			hd=new Hotel_Details(driver);
			
		}
		
		return hd;
	}

	public Hotel_Booking getHb() {
		
		if (hb==null) {
			
		hb=new Hotel_Booking(driver);
		}
		return hb;
		
	}

	public Hotel_Selection getHs() {
	
		if (hs==null) {
			
		hs=new Hotel_Selection(driver);
		}
		return hs;
	}

	public Invoice_Page getIp() {
		
		if (ip==null) {
			
		ip=new Invoice_Page(driver);
		}
		return ip;
	}
	

}
