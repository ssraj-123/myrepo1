package com.program.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteDemo {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:/Selenium Advance/myfolder/testdata.xlsx");
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook workbooks = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbooks.getSheet("mydatasheet");
		XSSFCell cell = sheet.getRow(1).createCell(4);
		cell.setCellValue("helloWorld");
		FileOutputStream fos=  new FileOutputStream(new File("C:/Selenium Advance/myfolder/testdata.xlsx"));
		workbooks.write(fos);
		fos.flush();
	}

}
