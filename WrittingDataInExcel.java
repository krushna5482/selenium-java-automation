package com.testing;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingDataInExcel {

	public static void main(String[] args) throws Throwable {
		
		FileOutputStream file =new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\myfile.xlsx");
		
		 XSSFWorkbook workbook=new  XSSFWorkbook();
		 
		 XSSFSheet sheet=workbook.createSheet("Data");
		 XSSFRow row1=sheet.createRow(0);
		 row1.createCell(0).setCellValue("java");
		 row1.createCell(1).setCellValue("1234");
		 row1.createCell(2).setCellValue("automation");
		 row1.createCell(3).setCellValue("c++");
		 
		 XSSFRow row2=sheet.createRow(1);
		 row2.createCell(0).setCellValue("python");
		 row2.createCell(1).setCellValue(1234);
		 row2.createCell(2).setCellValue("automation");
		 row2.createCell(3).setCellValue("Pamda");
		 
		 XSSFRow row3=sheet.createRow(2);
		 row2.createCell(0).setCellValue("C#");
		 row2.createCell(1).setCellValue(1234);
		 row2.createCell(2).setCellValue("automation");
		 row2.createCell(3).setCellValue("NET");
		 
		 workbook.write(file);
		 workbook.close();
		 file.close();
		 System.out.println("hii");

	}

}
