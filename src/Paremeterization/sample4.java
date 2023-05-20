package Paremeterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample4 
{
	
	//TO GET BOOLEAN DATA FROM EXCELLSHEET...>SHEET3
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			
			FileInputStream file=new FileInputStream("D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\APACHE POI\\Paremeterization.xls");
			
			boolean s1=WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getCell(1).getBooleanCellValue();
			System.out.println(s1);
			
			
			
		}

}
