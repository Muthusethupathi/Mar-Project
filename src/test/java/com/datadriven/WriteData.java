package com.datadriven;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String [] args) throws IOException {
		File f = new File("C:\\Users\\Best\\eclipse-workspace\\MarProject\\src\\main\\java\\com\\exceldata\\Book2.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook();
		Sheet createSheet = wb.createSheet("Sheet1");
		createSheet.createRow(1).createCell(1).setCellValue("status");
		createSheet.createRow(1).createCell(1).setCellValue("I am happy");
		System.out.println("sucess");
		
		Workbook rb = new XSSFWorkbook(fis);
		String cell = rb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(cell);
		
		
	}
}
