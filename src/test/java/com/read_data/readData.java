package com.read_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readData {

	public static void particulardata() throws IOException
	
	{
		File f = new File("C:\\Users\\welcome\\eclipse-workspace\\Automation_Practice\\src\\test\\java\\com\\read_data\\UN and PWD.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);//up casting
		
		
		
		Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(2);
		
		Cell cell = row.getCell(0);
		
		CellType cellType = cell.getCellType();
		
		if(cellType.equals(CellType.STRING))
		
		{
			String stringCellValue = cell.getStringCellValue();

			System.out.println(stringCellValue);
		}
		
		else if (cellType.equals(CellType.NUMERIC)) {
			
		 		
			double numericCellValue = cell.getNumericCellValue();
			
			int value = (int) numericCellValue; 
			System.out.println(value);// narrowing Type cast
		}}
		
		public static void particulardata1() throws IOException
		
		{
			File f = new File("C:\\Users\\welcome\\eclipse-workspace\\Automation_Practice\\src\\test\\java\\com\\read_data\\UN and PWD.xlsx");
			
			FileInputStream fis = new FileInputStream(f);
			
			Workbook wb = new XSSFWorkbook(fis);//up casting
			
Sheet sheetAt = wb.getSheetAt(0);
		
		Row row = sheetAt.getRow(4);
		
		Cell cell = row.getCell(1);
		
		CellType cellType = cell.getCellType();
		
		if(cellType.equals(CellType.STRING))
		
		{
			String stringCellValue = cell.getStringCellValue();

			System.out.println(stringCellValue);
		}
		
		else if (cellType.equals(CellType.NUMERIC)) {
			
		 		
			double numericCellValue = cell.getNumericCellValue();
			
			int value = (int) numericCellValue; 
			System.out.println(value);// narrowing Type cast
		}
		
//		Sheet ns = wb.createSheet("new");
//		Row createRow = ns.createRow(5);
//		Cell createCell = createRow.createCell(5);
		
	}
		
		public static void allData() throws IOException {
			
			File f = new File("C:\\\\Users\\\\welcome\\\\eclipse-workspace\\\\Automation_Practice\\\\src\\\\test\\\\java\\\\com\\\\read_data\\\\UN and PWD.xlsx");
			
			FileInputStream fis = new FileInputStream(f);
			
			Workbook wb = new XSSFWorkbook(fis);
			
			Sheet sheetAt = wb.getSheetAt(0);
			
			int rsize = sheetAt.getPhysicalNumberOfRows();
			
			
			System.out.println("*******All data");
			
			for (int i = 0; i < rsize; i++) 
			{
				
				Row row = sheetAt.getRow(i);
				
				int csize = row.getPhysicalNumberOfCells();
				
				for (int j = 0; j < csize; j++) 
				{
					
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
					if (cellType.equals(CellType.STRING))
							
					{	
							String scv = cell.getStringCellValue();
							
					

					
							System.out.println(scv);
							
							}
					else if (cellType.equals(CellType.NUMERIC)) 
					
							{
							double ncv = cell.getNumericCellValue();
							
							int val = (int) ncv;
						

							
							System.out.println(val);
						
					}
					}
				
				
				
			}
			
			
		
		}
		
		public static void rowdata() throws IOException {
			
			File f = new File("C:\\Users\\welcome\\eclipse-workspace\\Automation_Practice\\src\\test\\java\\com\\read_data\\UN and PWD.xlsx");
			
			FileInputStream fis = new FileInputStream(f);
			
			Workbook wb = new XSSFWorkbook(fis);
			
			Sheet sheetAt = wb.getSheetAt(0);
			
			System.out.println("*******Row data");
			
			int rsize = sheetAt.getPhysicalNumberOfRows();
			
			for (int i = 0; i < rsize; i++) 
			{
				
				if(i==3)
				{
				
				Row row = sheetAt.getRow(i);
				
				int csize = row.getPhysicalNumberOfCells();
				
				for (int j = 0; j < csize; j++) {
					
				
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(CellType.STRING)) {
					
					String scv = cell.getStringCellValue();
					
				
					
					System.out.println(scv);
					
					}
			else if (cellType.equals(CellType.NUMERIC)) 
			
					{
					double ncv = cell.getNumericCellValue();
					
					int val = (int) ncv;
					
					
					System.out.println(val);
				
			}
			}}}
					
		
					
				}
		
		public static void columndata() throws IOException {
			
			File f = new File("C:\\\\Users\\\\welcome\\\\eclipse-workspace\\\\Automation_Practice\\\\src\\\\test\\\\java\\\\com\\\\read_data\\\\UN and PWD.xlsx");

FileInputStream fis = new FileInputStream(f);
			
			Workbook wb = new XSSFWorkbook(fis);
			
			Sheet sheetAt = wb.getSheetAt(0);
			
			System.out.println("*******Column data");
			
			int rsize = sheetAt.getPhysicalNumberOfRows();
			
			for (int i = 0; i < rsize; i++) 
			{
								
				Row row = sheetAt.getRow(i);
				
				int csize = row.getPhysicalNumberOfCells();
				
				for (int j = 0; j < csize; j++) {
					
				if (j==1) {
					
				
				
				Cell cell = row.getCell(j);
				
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(CellType.STRING)) {
					
					String scv = cell.getStringCellValue();
					
				
					
					System.out.println(scv);
					
					}
			else if (cellType.equals(CellType.NUMERIC)) 
			
					{
					double ncv = cell.getNumericCellValue();
					
					int val = (int) ncv;
					
					
					System.out.println(val);
				
			}
			}}}
		}
		
		
		public static void writedata() throws Throwable {
			
			File f = new File("C:\\Users\\welcome\\Desktop\\New Batch Details.xlsx");
			
			FileInputStream fis = new FileInputStream(f);
			
			Workbook wb = new XSSFWorkbook(fis);
			
			Sheet createSheet = wb.createSheet("New Batch1");
			
			Row createRow = createSheet.createRow(0);

			Cell createCell = createRow.createCell(0);
			
			createCell.setCellValue("Name");
		
			wb.getSheet("New Batch1").getRow(0).createCell(1).setCellValue("Course Name");
			
			wb.getSheet("New Batch1").getRow(0).createCell(2).setCellValue("Fees");
			
			Row createRow1 = createSheet.createRow(1);

			Cell createCell1 = createRow1.createCell(0);
			
			createCell1.setCellValue("Jiya");
		
					
			wb.getSheet("New Batch1").getRow(1).createCell(1).setCellValue("Selenium");
			
			wb.getSheet("New Batch1").getRow(1).createCell(2).setCellValue(18000.00);
			
			Row createRow2 = createSheet.createRow(2);
			
			Cell createCell2 = createRow2.createCell(0);
			createCell2.setCellValue("Gayu");
			
			wb.getSheet("New Batch1").getRow(2).createCell(1).setCellValue("Java");
			
			wb.getSheet("New Batch1").getRow(2).createCell(2).setCellValue(15000.00);

			Row createRow3 = createSheet.createRow(3);
			
			Cell createCell3 = createRow3.createCell(0);
			createCell3.setCellValue("Manoj");
			
			wb.getSheet("New Batch1").getRow(3).createCell(1).setCellValue("CAD");
			
			wb.getSheet("New Batch1").getRow(3).createCell(2).setCellValue(20000.00);
			
			FileOutputStream fos  = new FileOutputStream(f);
			
			wb.write(fos);
			
			System.out.println("Sheet Created and written");
			
			wb.close();
			
			
			
			
			
		}
				
			
		
	
	public static void main(String[] args) throws Throwable {
//		particulardata();
//		particulardata1();
		allData();
		rowdata();
		columndata();
		writedata();
	}
}	
		
	

