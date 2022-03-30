package com.runner_class;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.base_class.Base_Class;
import com.configuratorreader.Automation_File_Reader;
import com.logger.demo.Logger_Basic;
import com.pageobjctmanager.PageObjectManager;

public class Multiple_Automation extends Base_Class {

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

		clickOnElement(pom.getDress().getDress());
		clickOnElement(pom.getDress().getSize());	
		clickOnElement(pom.getDress().getColor());
		actions("movetoelement", pom.getDress().getFind());
		clickOnElement(pom.getDress().getAddToCard());	

		wait(30,TimeUnit.SECONDS);

		clickOnElement(pom.getDress().getCheck());	

		clickOnElement(pom.getSum().getCheck_Out());	

		clickOnElement(pom.getAddress().getCheck_Out());	

		clickOnElement(pom.getShipping().getCheck());	
		clickOnElement(pom.getShipping().getCheck_Out());	

		clickOnElement(pom.getPayment().getPay());	
		clickOnElement(pom.getPayment().getConfirm());	

		clickOnElement(pom.getBack().getBack());

		clickOnElement(pom.getSignOut().getSignOut());

		log.info("Dress Selection");

		clickOnElement(pom.getSign().getSignin_Btn());

		wait(30,TimeUnit.SECONDS);

		inputValueElement(pom.getLogin().getEmail(),Automation_File_Reader.get_Automation_File_Reader().get_Automation_Configurator_Reader().get_Email());
		inputValueElement(pom.getLogin().getPassword(),Automation_File_Reader.get_Automation_File_Reader().get_Automation_Configurator_Reader().get_Password());
		clickOnElement(pom.getLogin().getSubmit_Btn());

		clickOnElement(pom.getDress().getDresses());

		actions("movetoelement", pom.getDress().getDressesFind());

		wait(30,TimeUnit.SECONDS);


		clickOnElement(pom.getDress().getDressesAddToCard());

		wait(30,TimeUnit.SECONDS);

		clickOnElement(pom.getDress().getCheck());	


		clickOnElement(pom.getSum().getCheck_Out());	


		clickOnElement(pom.getAddress().getCheck_Out());	

		clickOnElement(pom.getShipping().getCheck());	
		clickOnElement(pom.getShipping().getCheck_Out());	

		clickOnElement(pom.getPayment().getPay());	
		clickOnElement(pom.getPayment().getConfirm());	

		clickOnElement(pom.getBack().getBack());

		clickOnElement(pom.getSignOut().getSignOut());

		log.info("T-shirt Selection");

		clickOnElement(pom.getSign().getSignin_Btn());

		wait(30,TimeUnit.SECONDS);//

		inputValueElement(pom.getLogin().getEmail(),Automation_File_Reader.get_Automation_File_Reader().get_Automation_Configurator_Reader().get_Email());
		inputValueElement(pom.getLogin().getPassword(),Automation_File_Reader.get_Automation_File_Reader().get_Automation_Configurator_Reader().get_Password());
		clickOnElement(pom.getLogin().getSubmit_Btn());

		clickOnElement(pom.getDress().getTShirt());

		actions("movetoelement", pom.getDress().getTShirtFind());

		wait(30,TimeUnit.SECONDS);

		clickOnElement(pom.getDress().getTShirtADDTOCard());	

		wait(30,TimeUnit.SECONDS);

		clickOnElement(pom.getDress().getCheck());	

		clickOnElement(pom.getSum().getCheck_Out());	

		clickOnElement(pom.getAddress().getCheck_Out());	

		clickOnElement(pom.getShipping().getCheck());	
		clickOnElement(pom.getShipping().getCheck_Out());	

		clickOnElement(pom.getPayment().getPay());	
		clickOnElement(pom.getPayment().getConfirm());	

		WebElement back2 = driver.findElement(By.xpath("//a[text()='Back to orders']"));
		clickOnElement(back2);

		WebElement signOut2 = driver.findElement(By.xpath("//a[@title='Log me out']"));
		clickOnElement(signOut2);
	}
}


