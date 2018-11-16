package com.program.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/Selenium Advance/myfolder/testdata.xlsx");
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook workbooks = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbooks.getSheet("mydatasheet");
		XSSFCell cell = sheet.getRow(1).getCell(1);
		
		
		String value = cell.getStringCellValue();
		System.out.println(value);
	}

}
