package Paremeterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample1 
{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//TO REACH UPTO EXCELLSHEET
		FileInputStream file=new FileInputStream("D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\APACHE POI\\Paremeterization.xls");
		
		//TO OPEN EXCELLSHEET
		Workbook s1=WorkbookFactory.create(file);
		
		//TO OPEN PARTICULAR SHEET
		Sheet s2=s1.getSheet("Sheet1");
		
		//TO HIGHLIGHT ROW
		Row s3=s2.getRow(0);
		
		//TO HIGHLIGHT CELL OR COLUMN
		Cell s4=s3.getCell(0);
		
		//TO GET/FETCH/RETRIVE/READ DATA/INFORMATION
		String s5=s4.getStringCellValue();
		System.out.println(s5);
		
	}

}
