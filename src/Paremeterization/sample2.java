package Paremeterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample2 
{
	//ORGANIZATION LEVEL
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\APACHE POI\\Paremeterization.xls");
		
		String s1=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(s1);
		
		
		
	}

}
