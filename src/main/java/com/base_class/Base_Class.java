package com.base_class;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.Value;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.implementation.ToStringMethod;

public class Base_Class {

	public static  WebDriver driver;	
	
	public static String value;

	public static  WebDriver browser_Configuration(String type) {

		if(type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\Driver1\\firefox.exe");

			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		return driver;
	}

	public static void inputValueElement(WebElement element,String data) {

		element.sendKeys(data);
	}

	public static void clickOnElement(WebElement element) {

		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void dropdown(String type, WebElement element,String value) {


		Select s = new Select(element);

		if(type.equalsIgnoreCase("byvalue"))
		{	
			s.selectByValue(value);

		}
		else if (type.equalsIgnoreCase("byvisuable text")) {

			s.selectByVisibleText(value);

		}

		else if (value.equalsIgnoreCase("byindex")) {

			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}


	}
	public static void TakesScreenshot(String type) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File des = new File(type);

		FileUtils.copyFile(source, des);

	}

	public static void geturl(String type) {

		driver.get(type);

	}

	public static void sessionEnd(String type) {

   if (type.equalsIgnoreCase("close")) {
	   
	   driver.close();
	
}
   else if (type.equalsIgnoreCase("quit")) {
	driver.quit();
}
        
	}
	public static void actions(String type, WebElement element) {


		Actions a = new Actions(driver);

		if (type.equalsIgnoreCase("moveToElement")) {

			a.moveToElement(element).build().perform();

		} 
		else if (type.equalsIgnoreCase("contextClick")) {

			a.contextClick(element).build().perform();

		} 

		else if (type.equalsIgnoreCase("click")) {

			a.click(element).build().perform();

		} 

		else if (type.equalsIgnoreCase("doubleClick")) {

			a.doubleClick(element).build().perform();

		} 

		else if (type.equalsIgnoreCase("clickAndHold")) {

			a.clickAndHold(element).build().perform();

		} 
		

		
	}

	public static void dragAndDrop(WebElement source, WebElement target) {


		Actions builder = new Actions(driver);
		
		builder.dragAndDrop(source, target);
	}
	
	public static void wait(long time,TimeUnit unit) {
		
		driver.manage().timeouts().implicitlyWait(time,unit);
		
	}

	
	public static String textdata(String path,int Rows,int cells) throws IOException {
		
		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(Rows);
	
		Cell cell = row.getCell(cells);

		CellType cellType = cell.getCellType();

		cell.getCellType();
		
		
		
		if(cellType.equals(CellType.STRING)) {

			 value = cell.getStringCellValue();

			

		}


		else if (cellType.equals(CellType.NUMERIC)) {

			double number = cell.getNumericCellValue();

			int val =(int) number;

			value=String.valueOf(val);
		
		
		}  

		 wb.close();		
		
		 return value;

	
	}

	}
































