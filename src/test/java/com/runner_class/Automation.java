package com.runner_class;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.base_class.Base_Class;
import com.configuratorreader.Automation_Configurator_Reader;
import com.configuratorreader.Automation_File_Reader;
import com.logger.demo.Logger_Basic;
import com.pageobjctmanager.PageObjectManager;

public class Automation extends Base_Class {

	public static WebDriver driver= browser_Configuration("chrome");

	public static PageObjectManager pom = new PageObjectManager(driver);   
	
	 public static Logger log =Logger.getLogger(Logger_Basic.class);  

	public static void main(String[] args) throws Throwable {

		PropertyConfigurator.configure("log4j.properties");
				
		String url = Automation_File_Reader.get_Automation_File_Reader().get_Automation_Configurator_Reader().get_Url();
		
		geturl(url);
		
		log.info("Url lanch");

		clickOnElement(pom.getSign().getSignin_Btn());

		wait(30,TimeUnit.SECONDS);

		inputValueElement(pom.getLogin().getEmail(),Automation_File_Reader.get_Automation_File_Reader().get_Automation_Configurator_Reader().get_Email());
		inputValueElement(pom.getLogin().getPassword(),Automation_File_Reader.get_Automation_File_Reader().get_Automation_Configurator_Reader().get_Password());
		
		clickOnElement(pom.getLogin().getSubmit_Btn());

		log.info("Loging Successfully");
		
		
		clickOnElement(pom.getDress().getDress());
		clickOnElement(pom.getDress().getSize());	
		clickOnElement(pom.getDress().getColor());
		actions("movetoelement", pom.getDress().getFind());
		clickOnElement(pom.getDress().getAddToCard());	

		wait(30,TimeUnit.SECONDS);

		clickOnElement(pom.getDress().getCheck());	

		log.info("Dress Selection");

		clickOnElement(pom.getSum().getCheck_Out());	

		log.info("Summary Checck out");
		
		clickOnElement(pom.getAddress().getCheck_Out());	

		log.info("Address Check out");

		clickOnElement(pom.getShipping().getCheck());	
		clickOnElement(pom.getShipping().getCheck_Out());	

		log.info("shipping Check out");
		
		clickOnElement(pom.getPayment().getPay());	
		clickOnElement(pom.getPayment().getConfirm());	

		log.info("Payment Check out");
		
		sessionEnd("close");
	}	
}



