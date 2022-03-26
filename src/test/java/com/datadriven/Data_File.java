package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Data_File {

public static void main(String[] args) throws  IOException {
		


		File f = new File("C:\\Users\\Best\\eclipse-workspace\\MarProject\\src\\main\\java\\com\\exceldata\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		Cell cell = row.getCell(1);
		
		Date cellStyle = cell.getDateCellValue();
		System.out.println(cellStyle);
		
		CellType cellType = cell.getCellType();
		
		
		if(cellType.equals(cellType.STRING)){
			
			String stringCellValue = cell.getStringCellValue();
			System.out.println("string value " + stringCellValue);

		}
		else if (cellType.equals(cellType.NUMERIC))
		{
			double numericCellValue = cell.getNumericCellValue();
			System.out.println("number value" + numericCellValue);
		}
		
		
}
	
}
