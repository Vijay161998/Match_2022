package com.runner_class;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.base_class.Base_Class;
import com.logger.demo.Logger_Basic;
import com.pageobjctmanager.Pagd_Object_Manager_Adactin;
import pom_adactin.Login_Page;

public class Adactin_Runner_Class extends Base_Class {

	public static WebDriver driver=browser_Configuration("chrome");
	
	public static Pagd_Object_Manager_Adactin pa= new Pagd_Object_Manager_Adactin(driver);

	 public static Logger loge =Logger.getLogger(Logger_Basic.class);

	public static void main(String[] args) throws Throwable {
		
		PropertyConfigurator.configure("log4j.properties");
		 	
		geturl("https://adactinhotelapp.com/");
		loge.info("Url lanch");
		
		inputValueElement(pa.getLog().getUser(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",11, 5));

		inputValueElement(pa.getLog().getPassword(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",12, 5));

		clickOnElement(pa.getLog().getLogin());

		loge.info("Logging Successfully");
		
		dropdown("byvalue",pa.getHd().getLocation(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",15, 5));
		dropdown("byvalue",pa.getHd().getHotel(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",16, 5)); 
		dropdown("byvalue",pa.getHd().getRoomType(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",17, 5));
		dropdown("byindex",pa.getHd().getNumOfRoom(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",18, 5));
		
		pa.getHd().getCheckIn().clear();
		inputValueElement(pa.getHd().getCheckIn(),"27/03/2022");	
		pa.getHd().getCheckOut().clear();
		inputValueElement(pa.getHd().getCheckOut(),"31/03/2022");
		dropdown("byindex",pa.getHd().getAdut(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",21, 5));
		dropdown("byindex",pa.getHd().getChild(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",22, 5));
		clickOnElement(pa.getHd().getSearch());
		loge.info("Enter HotelDetails");
		
		clickOnElement(pa.getHs().getRadio());
		clickOnElement(pa.getHs().getCon());
	
		loge.info("Enter HotelSelection");
		
		inputValueElement(pa.getHb().getFn(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",28, 5));
		inputValueElement(pa.getHb().getLa(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",29, 5));
		inputValueElement(pa.getHb().getAddress(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",30, 5));
		inputValueElement(pa.getHb().getCcNum(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",31, 5));

		
		dropdown("byvalue",pa.getHb().getCcType(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",32, 5));
		dropdown("byvalue",pa.getHb().getMon(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",33, 5));
		dropdown("byvalue",pa.getHb().getYear(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",34, 5));
		inputValueElement(pa.getHb().getCcv(),textdata("C:\\Users\\De\\Desktop\\Adactin.xlsx",35, 5));
		clickOnElement(pa.getHb().getBookNow());

		loge.info("Enter User Details");
		
		wait(30,TimeUnit.SECONDS);
		
		clickOnElement(pa.getIp().getInvoice());

		loge.info("Get invoice");
		
		TakesScreenshot("C:\\Users\\De\\eclipse-workspace\\March_22\\Screen\\auto.png");

	}
	
}


