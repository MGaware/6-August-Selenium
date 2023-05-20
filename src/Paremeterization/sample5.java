package Paremeterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class sample5 
{
	
	//TO CONVERT NUMERIC INFORMATION INTO STRING....>SHEET4('1234)
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException 
		{
			
			FileInputStream file=new FileInputStream("D:\\SOFTWARE TESTING\\AUTOMATION TESTING SOFTWARE\\APACHE POI\\Paremeterization.xls");
			
			String s1=WorkbookFactory.create(file).getSheet("Sheet4").getRow(1).getCell(1).getStringCellValue();
			System.out.println(s1);
			
			
			
		}

}
