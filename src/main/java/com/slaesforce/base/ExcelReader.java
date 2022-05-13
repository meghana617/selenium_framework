package com.slaesforce.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
 public static ArrayList getData(String filepath) {
	   ArrayList data =new ArrayList();
	 try {
			FileInputStream fis = new FileInputStream(new File(filepath));
			XSSFWorkbook workbook =new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> itr = sheet.iterator();
			while (itr.hasNext()) {
				 Row row = itr.next();
				  //  System.out.println(10);
				 Iterator<Cell> cellitr = row.cellIterator();
				 
				 while (cellitr.hasNext()) {
					 Cell cell = cellitr.next();
				data.add(cell.getStringCellValue() );
				 }
			}
			return data;
		} catch (Exception e) {
	      e.printStackTrace();
		}
	return data;
			
	}
}
