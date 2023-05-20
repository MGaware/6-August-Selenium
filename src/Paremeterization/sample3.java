package Paremeterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample3 
{
	   
	//TO GET INT DATA FROM EXCELLSHEET...>SHEET2
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		FileInputStream file=new FileInputStream("D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\APACHE POI\\Paremeterization.xls");
		
		double s1=WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(s1);
		
		
		
	}

}
