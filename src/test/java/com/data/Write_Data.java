package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Data {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\De\\Desktop\\data.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
	
		Workbook wb = new XSSFWorkbook(fis);
		

		wb.createSheet("vijay").createRow(0).createCell(0).setCellValue("User name");
	    
		wb.getSheet("vijay").getRow(0).createCell(1).setCellValue("Password");
        
		wb.getSheet("vijay").createRow(1).createCell(0).setCellValue("Vijay");

		wb.getSheet("vijay").getRow(1).createCell(1).setCellValue("Vijay@123");

		wb.getSheet("vijay").createRow(2).createCell(0).setCellValue("Vignesh");

		wb.getSheet("vijay").getRow(2).createCell(1).setCellValue(876);
       
		FileOutputStream fos = new FileOutputStream(f);
	
		wb.write(fos);
	
		wb.close();
		System.out.println("work Suffessfully");
	}
	

}
