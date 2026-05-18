package com.testing;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataInExcel {

	public static void main(String[] args) throws Throwable {
		
 FileInputStream file=new FileInputStream("C:\\seleniu_practice\\Testing\\TestData\\Employee Sample Data.xlsx");
 
     XSSFWorkbook workbook=new XSSFWorkbook(file);
     
     XSSFSheet sheet=workbook.getSheetAt(0);
     
     int totalrow=sheet.getLastRowNum();
     int totalclell=sheet.getRow(1).getLastCellNum();
     
     System.out.println(totalrow);
     System.out.println(totalclell);
     try
     {
     for (int r = 0;r <=totalrow; r++)
     {
    	XSSFRow currentrow= sheet.getRow(r);
    	 for (int c = 0; c < totalclell; c++) 
    	 {
			XSSFCell cell=currentrow.getCell(c);
		   System.out.print(cell.toString());
		}
		System.out.println();
	}
     }
     catch(Exception e)
     {
    	 
     }
     finally {
    	 workbook.close();
         file.close();
	}
     
     
     
	}

}
