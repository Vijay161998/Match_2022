package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {

	public static void cell_Data() throws IOException {

		File f = new File("C:\\Users\\De\\eclipse-workspace\\March_22\\TestCases\\data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(1);
	
		Cell cell = row.getCell(1);

		CellType cellType = cell.getCellType();

		if(cellType.equals(CellType.STRING)) {

			String value = cell.getStringCellValue();

			System.out.println(value);


		}


		else if (cellType.equals(CellType.NUMERIC)) {

			double number = cell.getNumericCellValue();

			int d =(int) number;

			System.out.println(d);

		}  

		wb.close();		


	}

	public static   void all_Data() throws IOException {

		File f = new File("C:\\Users\\De\\eclipse-workspace\\March_22\\TestCases\\data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		for(int i=0;i<sheetAt.getPhysicalNumberOfRows();i++){

			Row r = sheetAt.getRow(i);

			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {

				Cell cell = r.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {

					String str = cell.getStringCellValue();
					System.out.println(str);
				}
				else if (cellType.equals(CellType.NUMERIC)) {

					double d = cell.getNumericCellValue();

					int a = (int)d;

					String num =String.valueOf(a);
					System.out.println(num);
				}	

			}


		}   	

		wb.close();
	}

	public static void row_Data() throws IOException {

		File f = new File("C:\\Users\\De\\eclipse-workspace\\March_22\\TestCases\\data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		Row r = sheetAt.getRow(1);


		for(int i=0;i<r.getPhysicalNumberOfCells();i++){


			Cell cell = r.getCell(i);

			CellType cellType = cell.getCellType();

			if (cellType.equals(CellType.STRING)) {

				String str = cell.getStringCellValue();
				System.out.println(str);

			}
			else if (cellType.equals(CellType.NUMERIC)) {

				double d = cell.getNumericCellValue();

				int a = (int)d;

				String num =String.valueOf(a);
				System.out.println(num);
			}	

			wb.close();
		}
	}

	public static void column_Data() throws IOException {

		File f = new File("C:\\Users\\De\\eclipse-workspace\\March_22\\TestCases\\data.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		for(int i=0;i<sheetAt.getPhysicalNumberOfRows();i++){

			Row r = sheetAt.getRow(i);

			Cell cell = r.getCell(1);

			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {

				String str = cell.getStringCellValue();
				System.out.println(str);
			}
			else if (cellType.equals(CellType.NUMERIC)) {

				double d = cell.getNumericCellValue();

				int a = (int)d;

				String num =String.valueOf(a);
				System.out.println(num);
			}	

			wb.close();
		}
	}

	public static void main(String[] args) throws IOException {

		System.out.println("*****Prticular Cell Data*****");
		cell_Data();

		System.out.println("*****All Data*****");
		all_Data();

		System.out.println("*****row Data*****");
		row_Data();

		System.out.println("*****column Data*****");
		column_Data();
	}
}

